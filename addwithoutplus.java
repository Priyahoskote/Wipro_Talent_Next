package college;
import java.util.Scanner;

public class addwithoutplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        while (b != 0) {
            int carry = a & b;      // Calculate carry bits
            a = a ^ b;              // Sum without carry
            b = carry << 1;         // Shift carry to add in next bit position
        }

        System.out.println("Sum = " + a);
    }
}
