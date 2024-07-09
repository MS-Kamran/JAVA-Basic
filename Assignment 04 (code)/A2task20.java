/*Task 20:Write javacode of a program which takes a number and prints the digits from unit place, then tenth, then
hundredth*/

import java.util.Scanner;

public class A2task20 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        for (int i=n; n>0 ; )
        {            
            int r = n % 10;
            System.out.println(r);
            n = n / 10;
        }
    }        
}