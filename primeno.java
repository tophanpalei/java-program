import java.util.Scanner;
public class primeno {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no");
        int n=sc.nextInt();
        int i,count=0;
        for(i=1;i<=n;i++)
        {
             while(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==2)
        {
            System.out.println("it is a prime no");
        }
        else{
            System.out.println("it is not a prime no");
        }
    }
}
