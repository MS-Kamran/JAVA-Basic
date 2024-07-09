/*Task 8: Write javacode of a program which adds all numbers that are multiples of either 7 or 9 up to 600. 
 * Ensure that numbers like 63 are added only once in the sum.*/

import java.util.Scanner;

public class A2task8 {
    public static void main(String [] args) {
        
        int sum=0;
        
        for (int i=1; i<=600; i++)
        {
           if (i%7==0 || i%9==0)
           {
               sum = sum + i;
           }
        }
        System.out.println("SUM="+sum);
    }        
}