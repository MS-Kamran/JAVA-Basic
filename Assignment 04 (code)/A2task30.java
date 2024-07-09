/*Task 30: Ask user for a range. Count how many numbers are prime number and how many numbers are perfect 
numbers between that range.*/

import java.util.Scanner;

public class A2task30 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 1st Number For Range:");
        int n = scan.nextInt();
        System.out.println("Enter 2nd Number For Range:");
        int n1 = scan.nextInt();
        
        int prime=0 , perfect=0 , a , e;
        
        for (int i=n ; i<=n1 ; i++)
        {
            int c=0, sum=0;
            
            for (e=1 ; e<=i ; e++)
            {
                if (i%e==0)
                {
                    c++;
                    sum=sum+e;
                }
            }
            if (c==2)
            {
                System.out.println("The Perfect Number is: "+i);
                prime++;
            }
            else 
            {
                a = sum/2;
                
                if (a==i)
                {
                    System.out.println("The Perfect Number is: "+i);
                    perfect++;
                }
            }
        }
        System.out.println("TOTAL PRIME NUMBERS: "+prime);
        System.out.println("TOTAL PARFECT NUMBERS: "+perfect);
    }        
}