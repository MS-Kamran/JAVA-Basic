//Task 3:Write javacode of a program for finding area of a rectangle given height and width by the user.//

import java.util.Scanner;

public class task03 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter Height of a Rectangle:");
        int h = scan1.nextInt();
        
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter Width of e Rectangele:");
        int w = scan2.nextInt();
        
        int area = h * w ;
        System.out.println("Area of tthe T="+area);     
    }
}
    
    