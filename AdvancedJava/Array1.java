import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        //int arr[]={11,22,33,44,55,66,77};
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter array value at index:"+i+" : ");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }
        scan.close();
    }
}