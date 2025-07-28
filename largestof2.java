package college;

import java.util.Scanner;

public class largestof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("the largest is "+a);

		}else {
			System.out.println("the largest is "+b);

		}
	}

}
