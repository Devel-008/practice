package file;

import java.util.Scanner;
class MaxInput extends Exception{
    @Override
    public String toString(){
        return "Input can't be greater than 1 lakh";
    }
}
class MaxMultiplier extends Exception{
    @Override
    public String toString() {
        return "Input can't be greater than 7 thousand in multiplication";
    }
}
class Calc extends Error_exception
{

    public void add(int a,int b) throws MaxInput {
        if(a>100000||b>100000)

            throw new MaxInput();
        System.out.println("ADDITION RESULT:"+(a+b));

    }
    public void sub(int a,int b) throws MaxInput {
        if(a>100000||b>100000)

            throw new MaxInput();
        System.out.println("SUBTRACTION RESULT:"+(a-b));

    }
    public void mul(int a,int b) throws  MaxMultiplier {
        if (a>7000||b>7000) throw new MaxMultiplier();
        System.out.println("MULTIPLICATION RESULT:"+(a*b));

    }
    public void div(int a,int b) throws MaxInput,ArithmeticException  {
        if(a>100000||b>100000)

            throw new MaxInput();
        System.out.println("DIVISION RESULT:"+(a/b));

    }
}

public class Calculator {
    public static void main(String[] args) throws MaxMultiplier, MaxInput {
        Calc cc=new Calc();

        Scanner sc=new Scanner(System.in);
        String s;

        boolean flag=true;

        while(flag )
        {

            System.out.println("""
                    1) PRESS + to ADD\s
                      2) PRESS - to SUB\s
                      3) PRESS * to MUL\s
                      4) PRESS / to DIV\s
                     5) PRESS 0 to EXIT""");
            s=sc.next();


            System.out.println("ENTER THE VALUE OF TWO VALUES FOR CALCULATION=");
            int x=sc.nextInt();
            int y=sc.nextInt();


            switch (s) {
                case "+" -> cc.add(x, y);
                case "-" -> cc.sub(x, y);
                case "*" -> cc.mul(x, y);
                case "/" -> cc.div(x, y);
                case "0" -> flag = false;
                default -> System.out.println("Enter CORRECT CHOICE ");
            }


        }
    }
}


/*public static void operatorCheck(String opr) throws InvalidInput {
        if (opr.equals("+") || opr.equals("-") || opr.equals("*") || opr.equals("/")) return;
        throw new InvalidInput();
    }
    public static double add(int x,int y) throws MaxInputException {
        if (x>100000||y>100000) throw new MaxInputException();
        System.out.println("The value of "+x+" + "+y+" is : ");
        return x+y;
    }
    public static double subtract(int x,int y) throws MaxInputException {
        if (x>100000||y>100000) throw new MaxInputException();
        System.out.println("The value of "+x+" - "+y+" is : ");
        return x-y;
    }
    public static double multiply(int x,int y) throws MaxMultiplierException {
        if (x>7000||y>7000) throw new MaxMultiplierException();
        System.out.println("The value of "+x+" * "+y+" is : ");
        return x*y;
    }
    public static double divide(int x,int y) throws MaxInputException,ArithmeticException {
        if (x>100000||y>100000) throw new MaxInputException();
        System.out.println("The value of "+x+" / "+y+" is : ");
        return x/y;
    }
*/