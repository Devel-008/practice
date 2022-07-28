package file;
class My_thread3 extends Thread
{


    public My_thread3(String name)
    {
        super(name);

    }



    public void run()
    {
       int i=0;
       while(i<=1)
       {
          // System.out.println("~~~~~~~~~~~THREAD ID:::::::::::::"+getId());
           System.out.println("THREAD NAME:="+this.getName());
           i++;
       }

    }

}
public class Priority {
    public static void main(String[] args) {
        My_thread3 n=new My_thread3( "HELLO" );
        My_thread3 n1=new My_thread3("HELLO1" );
        My_thread3 n2=new My_thread3("HELLO2" );
        My_thread3 n3=new My_thread3("HELLO3" );
        My_thread3 n4=new My_thread3("HELLO4" );
        My_thread3 n5=new My_thread3("HELLO5" );
        My_thread3 n6=new My_thread3("HELLO6");
        My_thread3 n7=new My_thread3("HELLO7");

        n7.setPriority(7);
       // System.out.println(n7.getPriority());
        //n.setPriority(Thread.MIN_PRIORITY);
        //n1.setPriority(Thread.MIN_PRIORITY);
        //n2.setPriority(Thread.MIN_PRIORITY);
        //n3.setPriority(Thread.MIN_PRIORITY);
       // n4.setPriority(Thread.MIN_PRIORITY);
        //n5.setPriority(Thread.MIN_PRIORITY);
        //n6.setPriority(Thread.MIN_PRIORITY);


        n.start();
        System.out.println(n.getPriority());
        n1.start();
        System.out.println(n1.getPriority());
        n2.start();
        System.out.println(n2.getPriority());
        n3.start();
        System.out.println(n3.getPriority());
        n4.start();
        System.out.println(n4.getPriority());
        n5.start();
        System.out.println(n5.getPriority());
        n6.start();
        System.out.println(n6.getPriority());
        n7.start();
        System.out.println(n7.getPriority());


    }
}
