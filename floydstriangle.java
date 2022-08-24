import java.util.Scanner;
public class floydstriangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c,r,a=1;
        System.out.println("enter no of row:");
        n=sc.nextInt();
        System.out.println("the floyds triangle is:");
        for(c=1;c<=n;c++)
        {
            for(r=1;r<=c;r++)
            {
                System.out.print((a++)+" ");
            }
            System.out.println(" ");
        }

    }
}
