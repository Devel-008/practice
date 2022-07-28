class hello
{
    private int id;
    private String name;
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }
}
public class newclass
{
    public static void main(String[] args)
    {
        hello h=new hello();
        h.setId(1);
        System.out.println(h.getId());
        h.setName("LEELAVATI");
        System.out.println(h.getName());

    }
}