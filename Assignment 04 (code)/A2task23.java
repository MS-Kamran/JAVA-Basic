//Task 23: Combine Task 21 and 22 into a single program so that it can tell any number in words.//

import java.util.Scanner;

public class A2task23 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a many Digits Number:");
        int n = scan.nextInt();
        
        int c=1 , t=0 , e=0;
        
        for (int i=n; n>0; )
        {
            int r = n % 10;
            r = r * c;
            t = t + r;
            e++;
            n = n / 10;
            c = c * 10;
        }
        int i = 1;
        double p = t;
        while (i<=e)
        {
            int temp  = e;
            double sum = Math.pow(10,(e-i));
            double f = p / sum;
            
            if ((int)f==1)
            {
               System.out.println("ONE"); 
            }
            else if ((int)f==2)
            {
               System.out.println("TWO"); 
            }
            else if ((int)f==3)
            {
               System.out.println("THREE"); 
            }
            else if ((int)f==4)
            {
               System.out.println("FOUR"); 
            }
            else if ((int)f==5)
            {
               System.out.println("FIVE"); 
            }
            else if ((int)f==6)
            {
               System.out.println("SIX"); 
            }
            else if ((int)f==7)
            {
               System.out.println("SEVEN"); 
            }
            else if ((int)f==8)
            {
               System.out.println("EIGHT"); 
            }
            else if ((int)f==9)
            {
               System.out.println("NINE"); 
            }
            p = p % sum;
            i++;
            e = temp;
        }
    }        
}