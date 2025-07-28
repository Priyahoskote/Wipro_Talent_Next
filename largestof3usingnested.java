package college;

import java.util.Scanner;

public class largestof3usingnested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("the largest is "+a);
			}else {
				System.out.println("the largest is "+c);

			}
		}
		else if(b>c) {
			System.out.println("the largest is "+b);

		}
		else {
			System.out.println("the largest is "+c);

		}
	}

}


