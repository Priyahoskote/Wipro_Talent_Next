package college;

import java.util.Scanner;

public class positiveorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("it is a positive");
		}else {
			System.out.println("it is not positive");

		}
	}

}
