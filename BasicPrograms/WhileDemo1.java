import java.util.Scanner;

public class WhileDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N value: ");
        long n = scan.nextLong();

        long ocount = 0, ecount = 0;
        long oddSum = 0, evenSum = 0;

        while (n != 0) {
            long r = n % 10;  // extract last digit
            n = n / 10;       // remove last digit

            if (r % 2 == 0) {
                System.out.println("EVEN NUMBER: " + r);
                ecount++;
                evenSum += r;
            } else {
                System.out.println("ODD NUMBER: " + r);
                ocount++;
                oddSum += r;
            }
        }

        System.out.println("SUM OF ODD NUMBERS: " + oddSum);
        System.out.println("SUM OF EVEN NUMBERS: " + evenSum);
        System.out.println("ODD NUMBERS COUNT: " + ocount);
        System.out.println("EVEN NUMBERS COUNT: " + ecount);

        scan.close();
    }
}
