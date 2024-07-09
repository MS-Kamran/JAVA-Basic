/*Task 25:Write javacode of a program that takes a number and counts how many times that number can be divided 
 * by all numbers up to that number*/

import java.util.Scanner;

public class A2task25 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        int count=0;
        
        for (int i=1; i<=n ; i++)
        {            
            if (n%i==0)
            {
                count++;
            }
        }
        System.out.println(n+" could be divided = "+count+" times");        
    }        
}