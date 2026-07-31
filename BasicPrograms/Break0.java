import java.util.Scanner;

public class Break0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Gmail address: ");
        String text = sc.nextLine();

        int Acount = 0;
        int Ncount = 0;
        int Scount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '@') {
                break;   // Stop counting at @
            }

            if (Character.isLetter(ch)) {
                Acount++;
            } else if (Character.isDigit(ch)) {
                Ncount++;
            } else {
                Scount++;
            }
        }

        System.out.println("Alphabets: " + Acount);
        System.out.println("Numbers: " + Ncount);
        System.out.println("Special Characters: " + Scount);

        sc.close();
    }
}