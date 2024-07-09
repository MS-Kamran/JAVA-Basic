/*Task 1: Write javacode for the following: 1) Ask the user to enter the name of his favorite car.
2) Ask the user to enter a Number 3) Display the name of the user’s favorite car,number of time specified in the 
second step. Example: If the user enters “Toyota” and 20, your program should print the name Toyota twenty times.*/

import java.util.Scanner;

public class A2task01 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Your Favorite Car:");
        String car = scan.next();
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter a Number that many time the Car will Print:");
        int n = scan1.nextInt();
        
        for (int i=1; i<=n; i++)
        {
            System.out.println(i+")Favorite Car:"+car);
        }        
    }        
}