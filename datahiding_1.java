class datahiding_1{
    int a,b;
    private int c;
}
class datahiding_2
{
    public static void main(String args[])
    {
        datahiding_1 ob=new datahiding_1(); 
        int sum;
        ob.a=5;
        ob.b=30;
        ob.c=50;
        sum=ob.a+ob.b+ob.c;
        System.out.println("sum of three no is:");
        System.out.println(sum);
    }
}