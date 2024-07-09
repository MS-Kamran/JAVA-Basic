//Task 21: Write javacode of a program which takes a number and prints the digits from left to right.//

import java.util.Scanner;

public class A2task21 {
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
            System.out.println((int)f);
            p = p % sum;
            i++;
            e = temp;
        }
    }        
}