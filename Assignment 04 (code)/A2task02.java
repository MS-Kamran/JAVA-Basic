/*Task 2:Write javacode to display all the odd numbers between 10 and 50.*/

import java.util.Scanner;

public class A2task02 {
    public static void main(String [] args) {
        
        
        for (int i=10; i<=50; i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
        }        
    }        
}