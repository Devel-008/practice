import java.util.Scanner;

public class practiceee1 {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);

        System.out.println("Student Name and class and section= " );
        String n=p.next();
        String c=p.next();

        System.out.println("1)English"+"\n"+"2)Maths"+"\n"+"3)Hindi"+"\n"+"4)Science"+"\n"+"5)Social science"+ "all subjects marks out of 100 = " );
        int e=p.nextInt();
        int m=p.nextInt();
        int h=p.nextInt();
        int s=p.nextInt();
        int ss=p.nextInt();

        int total=e+m+h+s+ss;
        float per=(total*100)/500;
        System.out.println("Total Marks and Percentage:= " );
        System.out.println(total);
        System.out.println(per);

    }
}
