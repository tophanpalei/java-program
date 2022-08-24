public class thisasamethod {
    int a,b;
    thisasamethod(int x)
    {
        a=x;
    }
    thisasamethod(int x,int y)
    {
        this(10);
         b=y;
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[])
    {
        thisasamethod ob=new thisasamethod(20,30);
        ob.show();  
    }
}
