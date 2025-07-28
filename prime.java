package college;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println("size of array");
			int size= sc.nextInt();
			int arr[]=new int[size];
			int sum=0;
			int count=0;
			
			System.out.println("elements of array");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("prime elements of array");
			for(int i=0;i<size;i++) {
				if (isPrime(arr[i])) {
					
					System.out.println(arr[i]);
//					sum+=arr[i];
					count+=1;
//					System.out.println("sum of prime number"+sum);

				}
				
			}
//			System.out.println("sum of prime number"+sum);
			System.out.println("count of prime number "+count);


	}
			public static boolean isPrime(int num) {
				if(num<=1) 
					return false;
				for(int i=2;i<=Math.sqrt(num);i++) {
					if(num%i==0) 
						return false;

				}
					return true;
				}
				
}


