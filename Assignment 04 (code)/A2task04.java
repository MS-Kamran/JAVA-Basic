/*Task 4: Write javacode for the following:Take twenty numbers input from the user and find the minimum from 
all numbers and the average of the even numbers entered by the user. [If the user enters odd numbers ignore them]*/

import java.util.Scanner;

public class A2task04 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter 1st Number:");
        int n1 = scan1.nextInt();
        
        int sum = 0;
        sum = sum + n1;
        int min = n1;
        
        for (int i=1; i<=20-1; i++)
        {
            Scanner scan = new Scanner (System.in);
            System.out.println("Enter a Number:");
            int n = scan.nextInt();
            
            if (n%2==0)
            {
                sum = sum + n;
            
                if (n<min)
                {
                    min=n;
                }
            }
        }
        int avg = sum /20;
        
        System.out.println("MIN="+min);
        System.out.println("AVERAGE="+avg);
    }        
}