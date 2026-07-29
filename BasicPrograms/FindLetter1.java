import java.util.Scanner;

public class FindLetter1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = sc.nextLine();
        System.out.print("Enter the Character: ");
        char letter = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == letter) {
                System.out.println(letter + " is found at index: " + i);
                count++;
            }
        }
            if (count == 0) {
            System.out.println(letter + " is not found.");
        }
        sc.close();
    }
}

