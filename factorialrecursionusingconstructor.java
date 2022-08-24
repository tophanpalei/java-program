import java.util.Scanner;
public class factorialrecursionusingconstructor{
    int n;
    factorialrecursionusingconstructor(int x)
    {
       n=x;
    }

    int factorial(n)
    {
        if(n==1 || n==0)
        {
            return 1; 
        }
             else
                   return n*factorial(n-1);
    }
    System.out.println("the factorial of given no is");
     
    System.out.println(n);
    {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no which is want to get its factorial");
        int x=sc.nextInt();
        factorialrecursionusingconstructor ob=new factorialrecursionusingconstructor(x);
        ob.factorial();
    }      

}
}
