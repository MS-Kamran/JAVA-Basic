/*Task 16: Write javacode of a program that reads marks of ten courses and prints the maximum, minimum
and average of those ten marks.*/

import java.util.Scanner;

public class A2task16 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        int sum=0, max=n, min=n, c=0;
        
        for (int i=1; i<10; i++)
        {
            Scanner scan1 = new Scanner (System.in);
            System.out.println("Enter You Course Marks:");
            int n1 = scan1.nextInt();
            
            sum = sum + n1;
            c++;
            
            if (n1>max)
            {
                max=n1;
            }
            if (n1<min)
            {
                min=n1;
            }                       
        }
        System.out.println("MAXIMUM MARKS="+max);
        System.out.println("MINIMUM MARKS="+min);
        int avg = sum/c;
        System.out.println("AVERAGE MARKS="+avg);
    }        
}