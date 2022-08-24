import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        System.out.println("enter the mark between 600:");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=300)
        {
            System.out.println("passed");
        }
        if(mark<=300)
        {
            System.out.println("failed");
        }
        if(mark==600)
        {
            System.out.print("topper");
        }
        if(mark>359 && mark<601)
        {
            System.out.print(" and 1st division");
        }
      
    }
    
}
