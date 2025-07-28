package college;

import java.util.Scanner;

public class smallestinarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int size= sc.nextInt();
		int arr[]=new int[size];
		int max=arr[0];
		System.out.println("elements of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}	
		}
		System.out.println("max value "+max);
	}
}
