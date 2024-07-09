/*Task 12:Solve Task 10 for numbers that are multiples of 4, instead of odd numbers.*/

import java.util.Scanner;

public class A2task12 {
    public static void main(String [] args) {
        
        int sum=0, c=0;
        double avg;
        
        for (int i=1; i<=10; i++)
        {
            Scanner scan = new Scanner (System.in);
            System.out.println("Enter a Number:");
            int n = scan.nextInt();
            
            if (n%4==0)
            {
                c++;
                sum = sum + n;
            }
        }
        avg = sum/c;
        System.out.println("AVERAG="+avg);
    }        
}