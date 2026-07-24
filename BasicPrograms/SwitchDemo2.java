import java.util.Scanner;
public class SwitchDemo2 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("A.add S.sub M.mul D.div R.reminder Enter Your choice: ");
        char ch=scan.next().charAt(0);
        switch(ch){
            case 'A': case 'a':
                System.out.println("Addition: "+(a+b));
                break;
            case 'S': case 's':
                System.out.println("Subtraction: "+(a-b));
                break;
            case 'M': case 'm':
                System.out.println("Multiplication: "+(a*b));
                break;
            case 'D': case 'd':
                System.out.println("Division: "+(a/b));
                break;
            case 'R': case 'r':
                System.out.println("Reminder: "+(a%b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}
