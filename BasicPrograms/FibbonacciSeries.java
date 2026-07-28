import java.util.Scanner;
public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n number:");
        int n = scanner.nextInt();
        int f1=-1;
        int f2=1;
        int f3;
        for(int i=0;i<n;i++){
            f3=f1+f2; // f3=-1+1  1=0 0 1
            System.out.print(f3+" ");
            f1=f2; // f1=1 0 1
            f2=f3; // f2=0 1 1
        }
        scanner.close();
    }
}
