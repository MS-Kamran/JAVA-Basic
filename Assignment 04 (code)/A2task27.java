//Task 27:Write javacode of a program that finds and displays all the prime numbers less than 1000.//

public class A2task27 {
    public static void main(String [] args) {
        
        for (int i=1 ; i<=1000 ; i++)
        {
            int e, c=1;
            
            for (e=1 ; e<=i ; e++)
            {
                if (i%e==0)
                {
                    c++;
                }
                e++;
            }
            if(c==2)
            {
                System.out.println(i);
            }
        }
    }        
}