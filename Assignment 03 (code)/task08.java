/*Task 8:A leading newspaper pays all their freelance writers at a rate of Tk. 500 per published article. Write
javacode of a program that will read the number of published articles for one writer, and print the
total monthly fees for that writer.*/

import java.util.Scanner;

public class task08 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number of Articals that published:");
        int n = scan.nextInt();
        
        int fee = n*500;
        
        System.out.println("Total fee for the writer is: "+fee); 
    }
}