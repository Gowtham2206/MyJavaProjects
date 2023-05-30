package vaantest;

public class Prime {

	public static void main(String[] args) {
		int a = 19;
		int count =0;
		for(int i = 1;i<=a;i++) {
			int b=a%i;
			if(b==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("This is a prime num");
		}
		else {
			System.out.println("This is not a prime num");
		}

	}

}
