import java.util.Scanner;

public class index1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        String indexes = "";

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == letter) {

                if (!indexes.isEmpty()) {
                    indexes += ",";
                }

                indexes += i;
            }
        }

        if (!indexes.isEmpty()) {
            System.out.println(letter + " found at index: " + indexes);
        } else {
            System.out.println(letter + " is not found");
        }

        scanner.close();
    }
}