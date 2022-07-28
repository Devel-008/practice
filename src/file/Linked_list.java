package file;

import java.util.*;

public class Linked_list
{
    public static void main(String[] args)
    {
        LinkedList<Integer> a=new LinkedList<>();
        LinkedList<Integer> a1=new LinkedList<>();
        a.add(66);
        a.add(68);
        a.add(67);
        a.add(69);
        a.add(0,60);
        a1.add(51);
        a1.add(552);
        a1.add(5522);
        a1.add(553);
        a.addAll(a1);
        System.out.println(a.clone());
        System.out.println(a.contains(99));
        System.out.println(a.indexOf(67));
        System.out.println(a.lastIndexOf(66));
        a.set(7,22);
        System.out.println(a.isEmpty());
        //System.out.println(a.iterator());

        for(int i=0;i<a.size();i++)
        {
            System.out.println("VALUE OF A = "+a.get(i));
            //System.out.println("VALUE OF A1 = "+a1.get(i)+" \n" );

        }
    }
}
