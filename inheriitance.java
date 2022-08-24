public class inheriitance {
    int a,b;
    void show()
    {
        System.out.println("i am in parent class");
    }
}
class dibya extends inheriitance
{
int c,d;
void display()
  {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    show();
  }
     public static void main(String args[])
   {
    dibya ob=new dibya();
    ob.display();
   }
}