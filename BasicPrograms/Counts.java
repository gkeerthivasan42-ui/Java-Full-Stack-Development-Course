import java.util.Scanner;

public class Counts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A gmail address:");
        String text = sc.nextLine();
        int Acount = 0;
        int Ncount = 0;
        int Scount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if () {
                Acount++;
            }
            if () {
                Ncount++;
            }
            if () {
                Scount++;
            }
            if ("@gmail.com")){
                break;
            }
        }
        System.out.println("Alphabets " + Acount);
        System.out.println("Numbers " + Ncount);
        System.out.println("Special Characters " + Scount);
    }
    
}
