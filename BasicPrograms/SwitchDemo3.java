import java.util.Scanner;
public class SwitchDemo3 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        String ch=scan.next();
        switch(ch){
            case "ADD":
                System.out.println("Addition: "+(a+b));
                break;
            case "SUB":
                System.out.println("Subtraction: "+(a-b));
                break;
            case "MUL":
                System.out.println("Multiplication: "+(a*b));
                break;
            case "DIV":
                System.out.println("Division: "+(a/b));
                break;
            case "REM":
                System.out.println("Reminder: "+(a%b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}
