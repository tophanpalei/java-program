public class addfunction {
    int logic(int x ,int y)
    {
    int sum=x+y;
    return sum; 
    }

public static void main(String args[])
{
int a=5,b=6;
addfunction obj1=new addfunction();

int c=obj1.logic(a,b);
int d=567,e=432;
int f=obj1.logic(d,e);
System.out.println(c);
System.out.println(f);
}
}

