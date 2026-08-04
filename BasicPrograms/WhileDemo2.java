import java.util.Scanner;

public class WhileDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N value: ");
        long n = scan.nextLong();

        long temp = n;
        long rev = 0;

        // Reverse the number
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        long oddSum = 0, evenSum = 0;
        int oddCount = 0, evenCount = 0;

        System.out.print("Odd Number: ");
        temp = rev;
        while (temp != 0) {
            long digit = temp % 10;
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
                oddSum += digit;
                oddCount++;
            }
            temp = temp / 10;
        }

        System.out.println();

        System.out.print("Even Number: ");
        temp = rev;
        while (temp != 0) {
            long digit = temp % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
                evenSum += digit;
                evenCount++;
            }
            temp = temp / 10;
        }

        System.out.println();
        System.out.println("Sum of Odd Numbers: " + oddSum);
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Odd Numbers Count: " + oddCount);
        System.out.println("Even Numbers Count: " + evenCount);

        scan.close();
    }
}