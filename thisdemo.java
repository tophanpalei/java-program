public class thisdemo{
    int a=10;
    void show()
    {
        int a=20;
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String args[])
    {
        thisdemo ob=new thisdemo();
        ob.show();
    }
}
