/*Task 12: Take value of a, b, c from the user. Then print in such a way that
value of a goes to b, value of b goes to c, value of c goes to a*/

import java.util.Scanner;

public class task12 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter a value for A:");
        int a = scan1.nextInt();
        
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter a value for B:");
        int b = scan2.nextInt();
        
        Scanner scan3 = new Scanner (System.in);
        System.out.println("Enter a value for C:");
        int c = scan3.nextInt();
        
        int temp;
        temp=a;
        a=c;
        c=b;
        b=temp;
        
        System.out.println("A="+a+", B="+b+", C="+c);
    }
}

