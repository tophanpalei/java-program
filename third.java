import java.util.Scanner;
class third
{
    public static void main(String args[])
    {
        
        int i,j,k,l,temp;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size of the array");
    int n =sc.nextInt();
    int a[] = new int[n];
    for(i=0;i<n;i++)
    {
        System.out.println("enter the array elements");
        a[i]=sc.nextInt();
    }
    for(j=0;j<n-1;j++)
    {
        for(k=0;k<n-j-1;k++)
        {
            if(a[k]>a[k+1])
            {
                temp=a[k];
                a[k]=a[k+1];
                a[k+1]=temp;
            }
        }
    }
    System.out.println("bubble sort is");
    for(l=0;l<n;l++)
    {
       System.out.println(+a[l]);
    }
     
    }
}