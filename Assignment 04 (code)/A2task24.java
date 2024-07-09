//Task 24:Write javacode of a program that takes a number and prints all numbers up to that number.// 

import java.util.Scanner;

public class A2task24 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        for (int i=1; i<=n ; i++)
        {            
            System.out.println(i);
        }
        
    }        
}