import java.util.Scanner;
public class factorial {
    int n;
    int fact=1;
        factorial(int x)
        {
             n=x;
        }
        void show()
         {
            
            for(int i=1;i<=n;i++)
               {
                  fact=fact*i;
               }
                System.out.println("factorial of given no is");
                System.out.println(fact);
         }

  class factorial1
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any no");
    int a=sc.nextInt();
    factorial ob=new factorial(a);
    ob.show();
    }
  }
}