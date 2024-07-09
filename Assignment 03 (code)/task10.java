/*Task 10: Write javacode for the following:
1) Ask the user to enter the name of his favorite car.
2) Display the name of the user’s favorite car 4 times.*/

import java.util.Scanner;

public class task10 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Favorite Car:");
        String car = scan.next();
        
        System.out.println(car);
        System.out.println(car);
        System.out.println(car);
        System.out.println(car);
    }
}

