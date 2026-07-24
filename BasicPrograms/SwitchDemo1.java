import java.util.Scanner;
public class SwitchDemo {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("A.add S.sub M.mul D.div R.reminder Enter Your choice: ");
        char ch=scan.next().charAt(0);
        switch(ch){
            case 'A':
                System.out.println("Addition: "+(a+b));
                break;
            case 'S':
                System.out.println("Subtraction: "+(a-b));
                break;
            case 'M':
                System.out.println("Multiplication: "+(a*b));
                break;
            case 'D':
                System.out.println("Division: "+(a/b));
                break;
            case 'R':
                System.out.println("Reminder: "+(a%b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}
