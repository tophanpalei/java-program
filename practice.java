import java.util.Scanner;
public class practice {
    static int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1; 
        }
             else
                   return n*factorial(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no which is want to get its factorial");
        int n=sc.nextInt();
        System.out.println("the factorial of given no is");
     
        System.out.println(factorial(n));
    }

}
