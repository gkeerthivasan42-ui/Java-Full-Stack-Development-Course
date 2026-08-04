import java.util.Scanner;
public class ReverseNumberWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // 1234
        int r=0;
        while(n!=0) // 1234 123 12 1
        {
            int rem=n%10;  // 4 3 2 1
            r=r*10+rem; // r= 0+4 40+3 430+2 4320+1 4321
            n=n/10; // 123 12 1 0
        }
        System.out.println("Reverse of the number is: " + r);
        sc.close();
    }
}