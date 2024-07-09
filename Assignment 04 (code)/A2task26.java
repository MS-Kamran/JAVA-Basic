//Task 26:Take one number from the user and tell if it is prime number or not//

import java.util.Scanner;

public class A2task26 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        int count=0;
        
        for (int i=1; i<=n ; i++)
        {            
            if (n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(n+" is Prime Number");
        }
        else
        {
            System.out.println(n+" is Not a Prime Number");
        }
    }        
}