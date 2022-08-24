import java.util.Scanner;
public class fibonacciseries {
    static int fibonacci(int i)
    {
     if(i==0)
     return 0;
     else if(i==1)
     return 1;
     else return fibonacci(i-1)+fibonacci(i-2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no whichn you want to get fibonacci:");
        int n=sc.nextInt();
        System.out.println("fibonacci series of entering no is");
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
    }
}

