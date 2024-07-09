//TASK 28: Take one number from the user and print sum of factors.//

import java.util.Scanner;

public class A2task28 {
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        int sum=0;
        
        for (int i=1; i<=n ; i++)
        {            
            if (n%i==0)
            {
                int m = n/i;
                sum = sum + m;
            }
        }
        System.out.println("SUM of FACTORS="+sum);
    }        
}