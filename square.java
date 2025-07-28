package college;
import java.util.Scanner;
public class square {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int ps = (int) Math.sqrt(num);
		if(ps * ps==num) {
			System.out.println("perfect square");
		}else {
			System.out.println("it is not perfect square");
			
		}
	}
}
