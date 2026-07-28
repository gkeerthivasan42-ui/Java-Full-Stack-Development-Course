import java.util.Scanner;
public class PrimeNumber1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int n = scanner.nextInt();
        int cnt=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                cnt++;
                System.out.println(n+" is not a prime number because it is divisible by "+i);
            }
        }
        if(cnt==0){
            System.out.println(n+" is a prime number.");
        scanner.close();
    }
}
}