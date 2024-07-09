/*Task 5:Write javacode of a program that finds the number of hours, minutes, and seconds 
 * in a given number of seconds. For example, how many hours, minutes, and seconds are there in 10,000 seconds?*/

import java.util.Scanner;

public class task05 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Seconds:");
        int sec = scan.nextInt();
        
        int hour = sec/3600;
        int sec2 = sec%3600;
        int min = sec2/60;
        int sec3 = sec2%60;
        
        System.out.println("Hour:"+hour+", Minute:"+min+", Sec:"+sec3);
    }   
}