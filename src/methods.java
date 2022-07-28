
public class methods
{
    int addd(int a, int b)
    {
        int c=a+b;
        return c;
    }
    static int suvvv(int a, int b)
    {
        int c=a-b;
        return c;
    }
    static void add1(int ...a)//vararg
    {
        int sum=0;
        for (int i : a) {
            sum+=i;
            System.out.println(sum);
        }

    }
    public static void main(String[] args)
    {
         methods m=new methods();
         int x=9;
         int y=9;
        System.out.println(m.addd(x,y));
        int z=suvvv(x,y);
        System.out.println(z);
        add1(2,3,4,5);
    }
}
