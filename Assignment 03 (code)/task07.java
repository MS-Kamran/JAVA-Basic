/*Task 7:Write javacode of a program that reads the values for the three sides x, y, and z of a triangle, 
 * and then calculates its area. The area is calculated as follows: area ? s(s ? x)(s ? y)(s ? z)*/

import java.util.Scanner;

public class task07 {
    public static void main(String [] args) {
        
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter a value for 'X' of a Tringle:");
        int x = scan1.nextInt();
        
        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter a value for 'Y' of a Tringle:");
        int y = scan2.nextInt();
        
        Scanner scan3 = new Scanner (System.in);
        System.out.println("Enter a vlaue for 'Z' of a Tringle:");
        int z = scan3.nextInt();
        
        double s= (x+y+z)/2;
        double area= Math.sqrt(s*(s-x)*(s-y)*(s-z));
        
        System.out.println("The Area of the Tringle is:"+area);
    }    
}