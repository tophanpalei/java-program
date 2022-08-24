import java.util.Scanner;
public class diamondpattern {
    int n;
    diamondpattern(int x)
    {
      n=x;
    }
        void show()
        {
            int i,j,k;
            for(i=0;i<n;i++)
            {
                for(j=n;j>i;j--)
                {
                    System.out.print(" ");
                }
                for(k=0;k<=i;k++)
                {
                    System.out.print("*" +" ");
                }
                System.out.print("\n");
            }
            for(i=1;i<n;i++)
            {
                for(j=0;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(k=n;k>i;k--)
                {
                    System.out.print("*" +" ");
                }
                System.out.print("\n");
            }
        }
    }
class pattern
{
    public static void main(String[] args) {
        System.out.println("enter a no:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
      
        diamondpattern ob=new diamondpattern(x);
        ob.show();
    }
}