package file;

import java.util.Scanner;

public class Practice_exception
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,5};
        boolean f=true;
        Scanner sc=new Scanner(System.in);
        int i=0;
        int u;
        while(f && i<5)
        {
            try
            {
                System.out.println("index Value=");
                u= sc.nextInt();

                System.out.println("value of a[index] is="+a[u]);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Invalid index");
                i++;

            }
        }
        if(!f && (i >= 5))
        {
            System.out.println("Cant try anymore only have 5 chance and you lost");
        }


    }
}
