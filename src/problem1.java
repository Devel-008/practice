import java.util.*;
public class problem1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      /*  float[] a = {5f,6.6f,7f,5f};
        float sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            System.out.println(sum);
        }
        System.out.println(sum);*/
        /*int[] a={1,2,3,4,5};
        System.out.println("Enter the number you want to search:=");
        int n=sc.nextInt();
        for (int j : a) {
            if (j == n) {
                System.out.println("Here my present=" + j);
            } else {
                System.out.println("Not Present!!!");
            }
            break;

        }*/
        /*int[] a={99,98,78,65,60};
        int x=500;
        int avg;

        int sum=0;
       for(int i: a) {
           sum += i;
       }         avg=(sum*100)/x;


        System.out.println(sum);
        System.out.println(avg);*/
        //Matrix Addition~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        /*int[][] a={{1,2,3},{2,3,4}};
        int [][]b={{3,4,5},{4,5,6}};
        int [][]c={{0,0,0},{0,0,0}};
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }*/
        int[] a={4,37,88,1,99,-1};
         int tmp=0;
         int tmp1=0;
        for (int i=0;i<a.length;i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    //System.out.println(p[i]);
                }
            }
           System.out.println(a[i]);
        }
        for (int i=0;i<a.length;i++)
        {
            if(a[i]>tmp)
            {
                tmp=a[i];
            }
            System.out.println("MAX:="+tmp);
            break;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<tmp1)
            {
                tmp1=a[i];

            }
            System.out.println("MIN:="+tmp1);
            break;
        }






    }
}
