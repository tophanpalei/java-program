import java.util.Scanner;
public class insertionsort {
    public static void insertion(int a[],int n)
    {
        int item,i,j;
        for(j=1;j<n;j++)
        {
            item=a[j];
            i=j-1;
            while((i>=0)&&(item<a[i]))
            {
                      a[i+1]=a[i];
                      i=i-1;
            }
            a[i+1]=item;
        }
            }
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
        insertion(a, n);
        System.out.println("insertion elements are:");
        for(l=0;l<n;l++)
        {
            System.out.println(a[l]);
        }
        
    }
}
