 abstract class parent
{
     abstract void greet();
}
class Battler extends parent
{
    @Override
    void greet()
    {
        System.out.println("HELLO Im baby1");
    }
}
class baby2 extends Battler
{
    @Override
    void greet() {
        //super.greet();
        System.out.println("GOOD MORNING Im BABY2");
    }
}
public class question {
    public static void main(String[] args) {
        Battler b=new Battler();
        baby2 b1=new baby2();

        b.greet();
        b1.greet();
    }
}
