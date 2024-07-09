/*TASK 17:In mathematics, the Fibonacci numbers form a sequence defined by the following recurrence relation:*/

public class A2task17 {
    public static void main(String [] args) {
        
        int x=0, y=1, sum=0,temp=0;
        
        System.out.println(x);
        System.out.println(y);
        
        while (sum<=1600)
        {
            sum = x + y;
            temp = y;
            y = sum;
            x = temp;
            
            System.out.println(sum);
        }
    }        
}