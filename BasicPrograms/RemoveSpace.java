import java.util.Scanner;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text:");
        String text=sc.nextLine();
        int len=text.length();
        String res="";
        for(int i=0;i<len-1;i++){
            char c1=text.charAt(i);
            char c2=text.charAt(i+1);
            if(c1==' ' && c2==32) // same value 32 and space " "
                continue;
            else
                res=res+c1;
        }
        System.out.println(res+text.charAt(len-1));
        sc.close();
    }
}
