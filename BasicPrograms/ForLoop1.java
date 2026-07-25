import java.util.Scanner;
public class ForLoop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i+"+");
        }
        System.out.println("\b="+sum);
        scan.close();
    }
}