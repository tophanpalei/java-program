import java.util.Scanner;


public class arrayin 
{
    public static void main(String args[])
    {
        int n,k,l;
        System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter the array elements");
        for(k=0;k<n;k++)
        {
            a[k]=sc.nextInt();
        }
        System.out.println("the array elements are:");
        for(l=0;l<n;l++)
        {
            System.out.print(a[l] +" ");
        }
        
    }
}
   
