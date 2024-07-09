/*Task 3: Write javacode for the following:Take twenty numbers input from the user and print the 
 * maximum and the average.*/

import java.util.Scanner;

public class A2task03 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter 1st Number:");
        int n1 = scan1.nextInt();
        
        int sum = 0;
        sum = sum + n1;
        int max = n1;
        
        for (int i=1; i<=7; i++)
        {
            Scanner scan = new Scanner (System.in);
            System.out.println("Enter a Number:");
            int n = scan.nextInt();
            
            sum = sum + i;
            
            if (n>max)
            {
                max=n;
            }                        
        }
        int avg = sum /7;
        
        System.out.println("MAX="+max);
        System.out.println("AVERAGE="+avg);
    }        
}