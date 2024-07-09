/*Task 29:Take one number from the user and calculate sum of factors less than the number itself. 
 * If the sum equals to the number, then print that the number is a perfect number.*/

import java.util.Scanner;

public class A2task29 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        int sum=0;
        
        for (int i=1; i<=n/2 ; i++)
        {            
            if (n%i==0)
            {
                sum = sum + i;
            }
        }
        if (n==sum)
        {
            System.out.println("PERFECT NUMBER");
        }
        else
        {
        System.out.println("NOT PERFECT NUMBER");
        }
    }        
}