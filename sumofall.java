package college;
import java.util.Scanner;


public class sumofall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int evensum=0;int oddsum=0;int primesum=0;
		int size= sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("elements of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
//		System.out.println("even elements of array");

				for(int i=0;i<size;i++) {
					if(arr[i]%2==0) {
					evensum+=arr[i];
					
					}
					else if(arr[i]%2!=0){
					oddsum+=arr[i];

					}
					}
				System.out.println("evensum "+evensum);
//				System.out.println("odd elements of array");
//				for(int i=size-1;i>=0;i--) {
//					if(arr[i]%2!=0) {
//					oddsum+=arr[i];
//					
//					}
//					}
				System.out.println("oddsum "+oddsum);

	}

}



