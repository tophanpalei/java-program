public class functionoverload {
    int a=60, b=70;
    
    void show()
    {
    System.out.println("hello world:");
    }
    void show(int x)
    {
        a=x;
     System.out.println(a);
     System.out.println("the sum of given nos is:");
    }
    void show(int x,int y)
    {
        a=x;
        b=x;
        int sum=a+b;
        System.out.println(sum);
    }
    class functionoverload1
    {
        public static void main(String[] args) {
            functionoverload ob=new functionoverload();
            ob.show();
            ob.show(20);
            ob.show(100,200);
        }
    }
}
