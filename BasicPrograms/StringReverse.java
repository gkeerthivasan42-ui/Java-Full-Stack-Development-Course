import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = scanner.nextLine();
        String reversedName = "";
        for(int i=name.length()-1;i>=0;i--){
            reversedName += name.charAt(i);
        }
        System.out.println("Reversed Name: " + reversedName);
        scanner.close();
    }
}
