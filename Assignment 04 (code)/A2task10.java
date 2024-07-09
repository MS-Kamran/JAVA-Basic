/*Task 10:Write javacode of a program that asks the user to enter ten numbers then display ONLY the total and 
 * the average of the odd numbers among those ten numbers.*/

import java.util.Scanner;

public class A2task10 {
    public static void main(String [] args) {
        
        int sum=0, c=0;
        double avg;
        
        for (int i=1; i<=10; i++)
        {
            Scanner scan = new Scanner (System.in);
            System.out.println("Enter a Number:");
            int n = scan.nextInt();
            
            if (n%2!=0)
            {
                c++;
                sum = sum + n;
            }
        }
        avg = sum/c;
        System.out.println("AVERAG="+avg);
    }        
}