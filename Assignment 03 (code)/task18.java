/*Task 18:Write javacode of a program that reads an integer, and prints the integer if it is a multiple of 
 * either 2 or 5 but not both.*/

import java.util.Scanner;

public class task18 {
    public static void main(String [] args) {
        
        Scanner sin = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = sin.nextInt();
        
        if (n%2==0) 
        {
            if (n%5==0)
            {   
            }
            else 
            {
                System.out.println(n+" is a multiple of either 2 or 5 not both");
            }
            
        }
        else
        {
            if (n%5==0)
            {  
                System.out.println(n+" is a multiple of either 2 or 5 not both");
            }
            else 
            {
            }
        }        
    }        
}