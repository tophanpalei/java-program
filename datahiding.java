public class datahiding {
     private int a,b;
  datahiding()
    {
        a=20;
        b=30;
    }
   public void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[])
    {
        datahiding ob=new datahiding();
        ob.show();

    }
}
