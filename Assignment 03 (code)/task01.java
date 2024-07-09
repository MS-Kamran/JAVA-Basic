/*Task 1:Write javacode of a program that reads a student’s mark for a single subject, 
 * and prints out “Pass” if the student got more than 50, and “You shall not pass” otherwise.*/

import java.util.Scanner;

public class task01 {
    public static void main(String [] args) {
        
        Scanner sin = new Scanner (System.in);
        System.out.println("Enter Your Marks:");
        int mark = sin.nextInt();
        
        if (mark>50) 
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("You Shall Not PASS");
        }
        
    }
    
    
}

