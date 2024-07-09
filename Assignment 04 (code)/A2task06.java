/*Task 6:Write javacode that will calculate the value of y if the expression of y is as follows (n is the input):
Y ? 12 ? 2 2 ? 3 2 ? 4 2 ? 52 ............? N2*/

import java.util.Scanner;

public class A2task06 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter a value for Y:");
        int y = scan1.nextInt();
        
        int sum=0, y1=0, y2=0;
        
        for (int i=1; i<=y; i++)
        {
            if (i%2==0)
            {
                y1 = y1 - i*i;
            }
            else
            {
                y2 = y2 + i*i;
            }
        }
        sum = y2 + y1;
        System.out.println("SUM="+sum);
    }        
}