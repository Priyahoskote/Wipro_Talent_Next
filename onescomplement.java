package college;

import java.util.Scanner;

public class onescomplement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int onescomp=~num;
		System.out.println("the ones complement of "+num+" is "+onescomp);
	}

}
