package college;
import java.util.Scanner;

public class multiplyby2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num << 1;

        System.out.println("After multiplying by 2: " + result);
    }
}
