import java.util.Scanner;
class multiplicationtable
 {
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no which multiplication table is printed");
      int n=sc.nextInt();
      int i;
      for(i=1;i<=10;i++)
      {
       
        System.out.println(+n +"X" +i +"=" +n * i);
      }
   } 
    
}
