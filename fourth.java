import java.util.Scanner;
class fourth{
   public static int binarysearch(int a[],int n,int x)
    {
        int low=0,high=n;
        while(low<high)
        {
           int mid=(low+high)/2;
           if(x<a[mid])
           {
            high=mid-1;
           }
           else if(x>a[mid])
           {
            low=mid+1;
           }
        else
        {
            return mid;
        }
           
        }
        return -1;
    }

public static void main(String args[])
{
    int i;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array elements");
    int n=sc.nextInt();
    int a[] = new int[n];
    System.out.println("enter the  array elements");
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt(); 
    }
    System.out.println("enter the no which is searched");
    int x=sc.nextInt();
    System.out.println("the no is in place of"+ binarysearch(a, n, x));
   
    


}
}