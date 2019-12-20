import java.util.Scanner;

class MyExce extends Exception
{
    int a ;
    MyExce()
    {   Scanner S = new Scanner(System.in);
        System.out.print("Enter integer : ");
        a = S.nextInt();

    }
    void divide()
    {
        try {
            double res = performDiv();    
        } catch (ArithmeticException e) {
            e.printStackTrace();
            e.toString();
            StackTraceElement[] stackt = e.getStackTrace();
            for(int i=0;i<stackt.length;i++)
            {
                System.out.println("Details of function " + (i+1));
                System.out.println("File name : " +stackt[i].getFileName());
                System.out.println("ClassName : " + stackt[i].getClassName());
                System.out.println("Method name : " + stackt[i].getMethodName());
                System.out.println("Line number : " +stackt[i].getLineNumber() );
            }
        }
        

    }
    double performDiv() throws ArithmeticException
    {
        throw new ArithmeticException();
    }
}

public class MyExceptionIn 
{
    public static void main(String[] args) {
        MyExce M = new MyExce();
        M.divide();
    }
}