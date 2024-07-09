//Task 19: Write javacode of a program which takes a number and prints the value of 10 to the power that number//

import java.util.Scanner;

public class A2task19 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Value:");
        int v = scan.nextInt();
        
        int p=1;
        
        for (int i=1; i<=v ; i++)
        {            
            p = p * 10;
        }
        System.out.println(p);
    }        
}