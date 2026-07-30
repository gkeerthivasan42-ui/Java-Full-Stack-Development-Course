public class Break1 {
    public static void main(String[] args) {
        for (int i = 5; i <= 40; i++) {
            System.out.println(i);
            if (i == 10 || i>20) 
            break; // Exit the loop when i is 5 
        }
        System.out.println("end");
    }
}
