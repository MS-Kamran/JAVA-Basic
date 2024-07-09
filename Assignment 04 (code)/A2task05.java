/*Task 5: Write javacode that reads the value of n and calculates the value of y if the expression of y is as 
 * follows: Y3 ? 13 ? 23 ? 33 ? 43 ? 53 ? 63 ? ............? N3*/

import java.util.Scanner;

public class A2task05 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter a value for Y:");
        int y = scan1.nextInt();
        
        int sum=0;
        
        for (int i=1; i<=y; i++)
        {
            sum = sum + i*i*i;
        }
        System.out.println("SUM="+sum);
    }        
}