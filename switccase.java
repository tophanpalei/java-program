import java.util.Scanner;

import javax.swing.table.DefaultTableCellRenderer;
public class switccase {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        char a=sc.next().charAt(0);
        switch(a){
            case 'a':
            System.out.println("it is a vowel");
            break;
            case 'e':
            System.out.println("it is a vowel");
            break;
            case 'i':
            System.out.println("it is a vowel");
            break;
            case 'o':
            System.out.println("it is a vowel");
            break;
            case 'u':
            System.out.println("it is a vowel");
            break;
            default:
            System.out.println("it is a consonants");

        }

}
}