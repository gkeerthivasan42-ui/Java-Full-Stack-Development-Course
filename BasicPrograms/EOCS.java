import java.util.Scanner;

public class EOCS{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = scan.nextLong();
        long seven=0,sodd=0,ceven=0,codd=0,edis=0,odis=0;
        long te=1,to=1;
        while(n>0){
            long rem=n%10;
            if(rem%2==0){
                seven=seven+rem; //seven+=rem;
                ceven++;
                //edis=edis*10+rem;
                edis=edis+rem*te; //0+4*1 4+2*10=24
                te=te*10; // 1*10=10 10*10=100
            }
            else{
                sodd=sodd+rem; //sodd+=rem;
                codd++;
                //odis=odis*10+rem;
                odis=odis+rem*to;
                to=to*10;
            }
            n=n/10;
        }
        System.out.println("Display even number:"+edis);
        System.out.println("Sum of even digits: "+seven);
        System.out.println("even Count: "+ceven);
        System.out.println("Display odd number:"+odis);
        System.out.println("Sum of odd digits: "+sodd);
        System.out.println("odd Count: "+codd);
        scan.close();
    }
}
