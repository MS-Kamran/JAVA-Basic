/*Task 18:Write javacode of a program which takes a number and tells how many digits are in that number*/

import java.util.Scanner;

public class A2task18 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a many Digits Number:");
        int n = scan.nextInt();
        
        int c=0;
        
        for (int i=n; n>0; )
        {
            int r = n % 10;
            c++;
            n = n / 10;
        }
        System.out.println("Total "+c+" digits");
    }        
}