import java.util.Scanner;
public class pascalstriangle {
    int n;
    pascalstriangle(int x)
    {
         n=x;
    }
    void show()
    {
        int i,j,k,num;
        System.out.println("pascal triangle ");
        for(i=0;i<=n;i++)
        {
            for(j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            num =1;
            for(k=0;k<=i;k++)
            {
                System.out.print(num + " ");
                num=num*(i-k)/(k+1);
            }
            System.out.print("\n");
        }
    }
}
class  triangle{
    public static void main(String[] args) {
        System.out.println("enter any no:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        pascalstriangle ob=new  pascalstriangle(x);
        ob.show();
    }
}
