package vaantest;
import java.util.*;

public class Niven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int num=sc.nextInt();
		int temp =num;
		int rem=0;
		while(num>0) {
			rem += num%10;
			num /=10;			
		}
		System.out.println(rem);
		if(temp%rem==0) {
			System.out.println("Its niven number");
		}
		else {
			System.out.println("Not a niven number");
		}
		
		

	}

}
