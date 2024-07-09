/*Task 14:Take a number from user and print its absolute value. If user gives minus five, print positive five. 
 * If user gives positive five, print positive five. No need to print plus sign.*/

import java.util.Scanner;

public class task14 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        if (n<0) 
        {
            int abs = n * -1;
            System.out.println(abs);
        }
        else
        {
            System.out.println(n);
        }
        
    }
    
    
}

