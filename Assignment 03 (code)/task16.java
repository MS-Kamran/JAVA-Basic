/*Task 16: Write javacode of a program that reads an integer, and if the number is even and greater than 10, 
 * prints�An even number greater than 10�. If the number is even but lesser than 10, print �An even number not
greater than 10�. If the number is greater than 10 but odd, print �An odd number greater than 10�. If the
number is odd and also less than 10, print �An odd number less than 10�.*/

import java.util.Scanner;

public class task16 {
    public static void main(String [] args) {
        
        Scanner sin = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = sin.nextInt();
        
        if (n>10) 
        {
            if (n%2==0)
            {
                System.out.println("An even number greater than 10");
            }
            else 
            {
                System.out.println("An odd number greater than 10");
            }
        }
        else
        {
            if (n%2==0)
            {
                System.out.println("An even number less than 10");
            }
            else 
            {
                System.out.println("An odd number less than 10");
            }
        }        
    }        
}

