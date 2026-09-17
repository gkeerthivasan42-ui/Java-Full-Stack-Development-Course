package aj;

import java.util.Scanner;

class AgeException extends Exception{
    Scanner scan=new Scanner(System.in);
    AgeException() // default constructor
    {
        System.out.println("Enter Age:");
        int age=scan.nextInt();
        if (age>=18) 
        {
            System.out.println("Age is accepted");
        }
        else
        {
            try
            {
                throw new Exception("below 18 age is not accepted to vote");
            }
            catch(Exception keerthi)
            {
                System.out.println(keerthi.toString());
            }
            new AgeException();
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        new AgeException();
    }
    
}
