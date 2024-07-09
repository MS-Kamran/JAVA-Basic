/*Task 13:Write javacode of a program that reads a number N, and prints out the sum of all odd numbers from 1 to
N inclusive. For instance, if the input is 6, the output for the program should be 9.*/

import java.util.Scanner;

public class A2task13 {
    public static void main(String [] args) {
        
        int sum=0;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number For Range:");
        int n = scan.nextInt();
        
        for (int i=1; i<=n; i++)
        {
            if (i%2!=0)
            sum = sum + i;
            
        }
        System.out.println("SUM:"+sum);
    }        
}