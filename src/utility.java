class dodo extends Thread
{
    public void run()

    {
        for (int i = 1; i!=0; i++) {
            System.out.println("good noon");
        }
    }
}
class dodo1 extends Thread
{
    public void run()
    {
        for(int j=1;j!=0;j++)
        {

            System.out.println("GOOD NIGHT");
        }
    }
}
public class utility {
    public static void main(String[] args) {
        dodo d=new dodo();
        d.start();

         dodo1 d1=new dodo1();
         d1.start();

    }
}
