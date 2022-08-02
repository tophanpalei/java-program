public class tophan1 {
    int a=30,b=20;
    tophan1()
    {
        a=3;
    }
    tophan1(int x)
    {
        System.out.println("hello world");
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
    void fun()
    {
        int sum=a+b;
         System.out.println(sum);
    }
}
class tophan2
{
    public static void main(String bali[])
{
    tophan1 oa=new tophan1(5);
    oa.fun();
    tophan1 ob=new tophan1();
    ob.show();
}
}