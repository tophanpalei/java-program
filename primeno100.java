
public class primeno100 {
    public static void main(String args[])
    {
       
        int i,j;
        
        for(i=1;i<=100;i++)
        {
            int count=0;
            for(j=1;j<=i;j++)
            {
                
             while(i%j==0)
               {
                count++;
                 break;
              }
             
            }
            while(count==2)
            {
                System.out.print(i+"  ") ;
              break;
             }
            }
   }
}