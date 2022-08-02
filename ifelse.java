import java.util.Scanner;
public class ifelse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char nm=sc.next().charAt(0);
        if(nm=='a'|| nm=='e'|| nm=='i' || nm=='o' || nm=='u')
        {
            System.out.println("you entered a vowel");
        }
        else{
            System.out.println("you entered a consonants");
        }
    }
}
