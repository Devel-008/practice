
public class problemset {
    static void multi(int ...arr)
    {
        int multi=1;
        for (int i:arr)
        {
            multi*=i;
        }
        System.out.println(multi);

    }
    static void pattern(int a)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println("");
        }
    }
    int add(int n)
    {
        if(n!=0)
        {
            return n + add(n-1);
        }
        else {
            return n;
        }
    }
    static void fib(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;++i)
        {
            c=a+b;
            System.out.print(c);
            a=b;
            b=c;
        }

    }
    public static void main(String[] args) {
        //multi(2,3);
       // pattern(6);
        /*problemset a=new problemset();
       int ab= a.add(5);
        System.out.println(ab);*/
        fib(6);

    }
}
