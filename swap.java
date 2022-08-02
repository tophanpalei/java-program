import java.util.Scanner;
public class swap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any two no");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp; 
        System.out.println("after swapping");    
        System.out.println(a);
        System.out.println(b);
        
    }
}
