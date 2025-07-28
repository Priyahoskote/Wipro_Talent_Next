package college;
import java.util.Scanner;


public class evenoroddsum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int sum=0;
		int size= sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("elements of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("even elements of array");

				for(int i=0;i<size;i++) {
					if(arr[i]%2==0) {
					sum+=arr[i];
					
					}
					}
				System.out.println(sum);


	}

}



