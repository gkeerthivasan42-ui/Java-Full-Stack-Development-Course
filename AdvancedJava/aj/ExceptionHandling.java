package aj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Enter Two Numbers:");
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=a%b;
            System.out.println("Remainder value:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Don't type text type only numbers");
        }
        scan.close();
    }
    
}
