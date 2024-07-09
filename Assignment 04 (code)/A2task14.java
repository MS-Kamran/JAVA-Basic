/*Task 14:Write javacode of a program that reads a list of numbers, and prints out the product of all the numbers
read. You may assume that the user first inputs the total number of numbers. For example, if the firstinput is 4, 
then the program has to read in four numbers from the user, and print out the product of
these four numbers. Assume that user will never enter first number as zero.*/

import java.util.Scanner;

public class A2task14 {
    public static void main(String [] args) {
                        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number For Range(with out ZERO):");
        int n = scan.nextInt();
        
        int sum=1;
        
        for (int i=1; i<=n; i++)
        {
            Scanner scan1 = new Scanner (System.in);
            System.out.println("Enter a Number:");
            int x = scan1.nextInt();
            
            sum = sum * x;
        }
        System.out.println("Product="+sum);
    }        
}