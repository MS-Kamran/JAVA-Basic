//PROBLEM 13) Rhombus Just draw the image of the above number triangle once. And then, the opposite, once.//

import java.util.Scanner;

public class Problem13{
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        int a=0;
        
        for (int r=1; r<=n-1; r++)
        {
            for (int s=1; s<=n-r; s++)
            {
            System.out.print(" ");
            }
            for (int i=1; i<=r*2-1 ; i++)
            {
                System.out.print(i);
            }
        System.out.println();
        a++;
        }
        
        if ((n-1)==a)
        {
            int p=0;
            for (int r=n; r<=n; r--)
            {                
                for (int s=1; s<=n-r; s++)
                {
                System.out.print(" ");
                }
                for (int i=1; i<=r*2-1 ; i++)
                {
                System.out.print(i);
                }
            System.out.println();
            p++;
            if (p==n)
               break;
            }
        }
    }        
}