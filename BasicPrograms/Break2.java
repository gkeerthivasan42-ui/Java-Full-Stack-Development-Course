import java.util.Scanner;

public class Break2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Gmail Address: ");
        String email = sc.nextLine();

        int alphaCount = 0;
        int numberCount = 0;
        int specialCount = 0;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            if (ch == '@') {
                break; // Stop counting at '@'
            }

            if (Character.isLetter(ch)) {
                alphaCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Alphabets count: " + alphaCount);
        System.out.println("Numbers count: " + numberCount);
        System.out.println("Special Characters count: " + specialCount);

        sc.close();
    }
}