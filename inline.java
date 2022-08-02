public class inline {
    int a1=35,a2=45;
    void show()
    {
        System.out.println(a1);
        System.out.println(a2);
    }
}
class d
{
    public static void main(String args[])
    {
        inline ob=new inline();
        ob.show();
    }
}