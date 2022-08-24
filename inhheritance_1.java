public class inhheritance_1 {
    int a=30,b=50;
    void show()
    {
        System.out.println("i am in child class");
    }
}
class chinmaya extends inhheritance_1
{
    int a=8,c=15;
    void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(super.a);
        show();
    }
    public static void main(String args[])
    {
        chinmaya ob=new chinmaya();
        ob.display();  
    }
}
