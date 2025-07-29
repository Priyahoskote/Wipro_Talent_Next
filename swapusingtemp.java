package college;

import java.util.Scanner;

public class swapusingtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter b number");
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a+" b= "+b);

	}

}
