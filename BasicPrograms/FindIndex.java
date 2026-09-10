import java.util.Scanner;

public class FindIndex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter text:");
        String name = scan.nextLine();

        System.out.println("Enter find char:");
        char c = scan.next().charAt(0);

        String res = "";

        for (int i = 0; i < name.length(); i++) {

            if (c == name.charAt(i)) {
                res = res + i + ",";
            }
        }

        if (res.length() == 0) {
            System.out.println(c + " is not found");
        } else {
            System.out.println(c + " found at index: " + res);
        }

        scan.close();
    }
}