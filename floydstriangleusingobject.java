import java.util.Scanner;
public class floydstriangleusingobject {
    int n,c,r,a=1;
    floydstriangleusingobject(int a)
    {
        n=a;
    }
    void show()
    {
        System.out.println("the floyds triangle is:");
        for(c=1;c<=n;c++)
        {
            for(r=1;r<=c;r++)
            {
                System.out.print((a++) +" ");
            }
            System.out.println("   ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of row:");
        int x=sc.nextInt();
        floydstriangleusingobject ob=new floydstriangleusingobject(x);
        ob.show();
    }
}
