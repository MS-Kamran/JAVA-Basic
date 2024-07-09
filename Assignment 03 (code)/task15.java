/*Task 15: Take hour from the user as input and tell it is time for which meal.
User will input the number in 24-hour format say 14 to mean 2pm, 3 to mean 3am, 18 to mean 6pm etc.
Valid inputs are 0 to 23. Inputs less than 0 or more than 23 are invalid in 24-hour clock.
Input will be whole numbers. For example, 3.5 will NOT be given as input.*/

import java.util.Scanner;

public class task15 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter any Hour:");
        int h = scan.nextInt();
        
        if (h>=0 && h<=23) 
        {
            if (h>=4 && h<=6)
            {
                System.out.println("BREAKFAST");
            }
            else if (h==12 || h==13)
            {
                System.out.println("Lunch");
            }
            else if (h==16 || h==17 )
            {
                System.out.println("SNACKS");
            }
            else if (h==19 || h==20)
            {
                System.out.println("DINNER");
            }
            else 
            {
                System.out.println("Patience is a virtue");
            }
        }
        else
        {
            System.out.println("Wrong Time");
        }        
    }        
}

