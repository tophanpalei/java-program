public class inheritance_2 {
    int a=30,b=50;
    void show()
    {
        System.out.println("i am in parent class");
    }
}
class shishira extends inhheritance_1
{
    int a=8,c=15;
    void show()
    {
        System.out.println("i am in child class");
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(super.a);
        show();
        super.show();
    }
    public static void main(String args[])
    {
        shishira ob=new shishira();
        ob.display();  
    }
}
