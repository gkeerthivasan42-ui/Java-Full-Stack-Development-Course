import java.util.Scanner;
public class Vowels1 {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.print("Enter a Name: ");
     String name=scan.nextLine();
     int len=name.length();
     int cnt=0;
     for(int i=0;i<len;i++){
        if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
            System.out.print(" " + name.charAt(i));
            cnt++;
        }
    }
    System.out.println("("+cnt+")");
    scan.close();
}
}
