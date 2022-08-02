import java.util.Scanner;
public class function 
{
     int tophan(int x,int y)  
    {
       if(x>y){
        return x;
       }
       else {
        return y;
       }
    }
    
 public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);  
    System.out.println("enter two no");
    int a=s.nextInt();
    int b=s.nextInt();
    // int c=tophan(a,b);
    function obj=new function();

    System.out.println("larger no is"+obj.tophan(a,b));
   }
   
}

   

