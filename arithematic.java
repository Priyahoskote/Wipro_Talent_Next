package college;

import java.util.Scanner;

public class arithematic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Addition"+(a+b));
	System.out.println("subtraction"+(a-b));
	System.out.println("multiplication"+(a*b));
	System.out.println("division"+(a/b));
	System.out.println("modulus"+(a%b));
}
}
