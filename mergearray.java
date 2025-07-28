package college;

import java.util.Arrays;
import java.util.Scanner;

public class mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int n1= sc.nextInt();
		int arr1[]=new int[n1];
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		
		System.out.println("elements of array1");
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("elements of array1 are");

		for(int i=0;i<n1;i++) {
		System.out.println(arr1[i]);
		}
		System.out.println("elements of array2");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("elements of array2 are");

		for(int i=0;i<n2;i++) {
			System.out.println(arr2[i]);
			}
		
		int merged[]=new int[n1+n2];
		for(int i=0;i<n1;i++) {
			merged[i]=arr1[i];
		}
		for(int i=0;i<n2;i++) {
			merged[n1+i]=arr2[i];

		}
		Arrays.sort(merged);
		System.out.println("merged array is");
		System.out.println(merged[0]);

		for(int i=1;i<merged.length;i++) {
			if(merged[i]!=merged[i-1]) {
			System.out.println(merged[i]+" ");
			}
		}
	}
}
