import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = scanner.nextLine();
        int count = 0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.print(" " + ch);
                count++;
            }
        }
        System.out.println("\nNumber of vowels: " + count);
        scanner.close();
    }
}
