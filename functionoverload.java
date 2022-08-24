public class functionoverload {
    int a=60, b=70;
    
    void show()
    {
    System.out.println("the sum of given nos is:");
    }
    void display()
    {
     int sum;
     sum=a+b;
     System.out.println(sum);
    }
    void dibya()
    {
        System.out.println("program run successful");
    }
    class functionoverload1
    {
        public static void main(String[] args) {
            functionoverload ob=new functionoverload();
            ob.show();
            ob.display();
            ob.dibya();
        }
    }
}
