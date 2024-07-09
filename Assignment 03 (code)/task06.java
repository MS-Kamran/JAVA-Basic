/*Task 6:Write javacode of a program that reads a value of S and then calculates the value of L.*/

import java.util.Scanner;

public class task06 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a value for 'S':");
        int s = scan.nextInt();
        
        if (s>=100)
        {
            int l1 = 12000/(4+((s*s)/14900));
            System.out.println("The Result of The Calculation is :" + l1);
        }
        else
        {
            int l2 = 3000-125*(s*s);
            System.out.println("The Result of The Calculation is :" + l2);
        }
    }   
}