public class inheritance_3 {
    int a,b;
    inheritance_3(int x)
    {
        a=2*x;
    }
    inheritance_3(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    } 
}
class dipak extends inheritance_3
{
int c,d;
    dipak(int p)
    {
       super(6,9);
       c=10;
       d=p;
    } 
    dipak(int p,int q)
    {
       super(7);
       c=q;
       d=2*p;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void main(String args[])
    {
        inheritance_3 oa=new inheritance_3(5);
        oa.show();
        dipak ob=new dipak(4,8);
        ob.display();
    }
}
