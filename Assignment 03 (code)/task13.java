/*Task 13:Take value of a, b, c, d from the user. Then print in such a way that
value of d goes to c,value of c goes to b,value of b goes to a,value of a goes to d*/

import java.util.Scanner;

public class task13 {
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
        
        Scanner scan4 = new Scanner (System.in);
        System.out.println("Enter a value for D:");
        int d = scan4.nextInt();
        
        int temp;
        temp=a;
        a=b;
        b=c;
        c=d;
        d=temp;
                
        System.out.println("A="+a+", B="+b+", C="+c+", D="+d);
    }
}

