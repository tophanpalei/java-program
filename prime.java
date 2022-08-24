import java.util.Scanner;
public class prime {
    int start,end;
    prime(int x,int y)
    {
        start=x;
        end=y;
    }
    void show()
    {
       System.out.println("prime nos are");
        for(int i=start;i<=end;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                  while(i%j==0)
                  {
                    count++;
                    break;
                  }
            }
            while(count==2)
            {
                System.out.print(i +" ");
               break;
            }
        }
    }
    class dibya
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter start no");
           int a=sc.nextInt();
           System.out.println("enter last no");
           int b=sc.nextInt();
           prime ob=new prime(a,b);
           ob.show();
        }
    }
}
