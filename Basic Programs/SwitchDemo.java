import java.util.Scanner;
public class SwitchDemo {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("1.add 2.sub 3.mul 4.div 5.reminder Enter Your choice: ");
        int ch=scan.nextInt();
        switch(ch){
            case 1:
                System.out.println("Addition: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                System.out.println("Division: "+(a/b));
                break;
            case 5:
                System.out.println("Reminder: "+(a%b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}
