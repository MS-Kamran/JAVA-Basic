/*Task 15:Write javacode of a program that will read 20 numbers from the user, and then print the sum of first 
 * number,then sum of the first 2 numbers, sum of first 3 numbers, and so on up to the sum of 20 numbers.*/

import java.util.Scanner;

public class A2task15 {
    public static void main(String [] args) {
        
        int sum=1;
        
        for (int i=1; i<=20; i++)
        {
            Scanner scan1 = new Scanner (System.in);
            System.out.println("Enter a Number:");
            int x = scan1.nextInt();
            
            sum = sum * x;
            System.out.println(i+"Number SUM="+sum);
        }
    }        
}