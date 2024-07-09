/*Task 11:Assume there are two variables a and b. Take values of these variables from the user and swip*/

import java.util.Scanner;

public class task11 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter a value for X:");
        int x = scan1.nextInt();
        
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter a value for Y:");
        int y = scan2.nextInt();
        
        int temp;
        
        temp=x;
        x=y;
        y=temp;
        
        System.out.println("X="+x);
        System.out.println("Y="+y);
        
    }
    
    
}

