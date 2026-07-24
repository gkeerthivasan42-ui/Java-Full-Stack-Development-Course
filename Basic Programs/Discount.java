import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: ");
        double amount = sc.nextDouble();

        double discount = 0;

        if (amount >= 6000) {
            discount = 10;
        } else if (amount >= 4000) {
            discount = 8;
        } else if (amount >= 2000) {
            discount = 7;
        } else if (amount >= 1000) {
            discount = 5;
        } else {
            discount = 0;
        }

        double discountAmount = amount * discount / 100;
        double payableAmount = amount - discountAmount;

        System.out.println("\nPurchase Amount : " + amount);
        System.out.println("Discount Percentage : " + discount + "%");
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Payable Amount : " + payableAmount);

        sc.close();
    }
}