/*Task 3) Assume that we have the following array. int[] a = new int[] {10, 30, 20, 50, 40};
Find the largest number and print it along with its location.*/

public class As5_t3 {
    public static void main (String[] args) {
        
        int n[] = {10, 30, 20, 50, 40};;
        
        int max=n[0];
        int p=0,i;
        
        for (i=0 ; i<n.length ; i++)
        {
            if (n[i]>max)
            {
                max = n[i];
                p = i;
            }
        }
        System.out.println("Max Number="+max);
        System.out.println("Index Number="+(p+1));
    }
}