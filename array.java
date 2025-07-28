package college;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");

		int size= sc.nextInt();
		int arr[]=new int[size];
		System.out.println("elements of array");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("elements of array are:");
		for(int i=0;i<size;i++) {
			
//			for(int i=0;i<size;i++) {

//			System.out.println(arr[i]);     //// print the array
//		}
			int square=arr[i]*arr[i];
			System.out.println(+arr[i]+" square is "+square);

	
		}

	}

}
