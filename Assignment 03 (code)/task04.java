//Task 4:Write javacode of a program that calculates the tax as follows

import java.util.Scanner;

public class task04 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter Your Income:");
        int income = scan1.nextInt();
        
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter Your Age:");
        int age = scan2.nextInt();
        
        if (age>18) 
        {
            if (income < 10000)
            {
                System.out.println("NO TAX");
            }
            else if (income>=10000 && income<=20000) 
            {
                int tax = income * 5/100;
                System.out.println("Your TAX is :"+tax);
            }
             else if (income>20000) 
            {
                int tax = income * 10/100;
                System.out.println("Your TAX is :"+tax);
            }
        }
        else
        {
            System.out.println("NO TAX");
        }            
    }
}