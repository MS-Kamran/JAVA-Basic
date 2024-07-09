/*Task 9:Write javacode of a program to find the largest among three different numbers entered by user.*/

import java.util.Scanner;

public class task09 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter 1st Number");
        int n1 = scan1.nextInt();
        
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter 2nd Number");
        int n2 = scan2.nextInt();
        
        Scanner scan3 = new Scanner (System.in);
        System.out.println("Enter 3rd Number");
        int n3 = scan3.nextInt();
        
        if (n1>n2) 
        {
            if (n1>n3)
            {
                System.out.println("Max Number is:"+n1);
            }
            else
            {
                System.out.println("Max Number is:"+n3);
            }
        }
        else
        {
            if (n2>n3)
            {
                System.out.println("Max Number is:"+n2);
            }
            else
            {
                System.out.println("Max Number is:"+n3);
            }
        }
        
    }    
}

