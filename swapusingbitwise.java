package college;
import java.util.Scanner;

public class swapusingbitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap using XOR
        a = a ^ b;
        b = a ^ b;  // (a ^ b) ^ b = a
        a = a ^ b;  // (a ^ b) ^ a = b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
