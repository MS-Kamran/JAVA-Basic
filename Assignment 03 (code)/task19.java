/*Task 19: Write javacode of a program that reads an integer, and prints the integer if it is a 
multiple of 2 and 5.*/

import java.util.Scanner;

public class task19 {
    public static void main(String [] args) {
        
        Scanner sin = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = sin.nextInt();
        
        if (n%2==0 && n%5==0) 
        {
            System.out.println(n+" is a multiple of either 2 and 5" );
        }
        else
        {
            System.out.println(n+" is not a multiple of either 2 and 5");
        }        
    }        
}