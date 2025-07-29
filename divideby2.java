package college;
import java.util.Scanner;

public class divideby2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num >> 1;

        System.out.println("After dividing by 2: " + result);
    }
}
