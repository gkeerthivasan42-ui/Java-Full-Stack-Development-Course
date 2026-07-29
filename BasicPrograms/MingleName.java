import java.util.Scanner;
public class MingleName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int len=name.length();
        int dec=--len;
        for (int i = 0; i < len/2+1; i++) {
            System.out.print(name.charAt(i)+""+ name.charAt(dec--));
        } 
        sc.close();
    }
}   
