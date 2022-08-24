import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class arithmatic {
    int a,b;
    arithmatic(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        int sum=a+b;
        int subtract=a-b;
        int product=a*b;
        int divisible=a/b;
        System.out.println(a +"+" +b +"=" +sum);
        System.out.println(a +"-" +b +"=" +subtract);
        System.out.println(a +"*" +b +"=" +product);
        System.out.println(a +"/" +b +"=" +divisible );
       
    }
    class arithmatic1
    {
    public static void main(String[] args)     
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any two no:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        arithmatic ob=new arithmatic(x,y);
        ob.show();
    }
       
    }
}
