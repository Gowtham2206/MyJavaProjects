package vaantest;
import java.util.*;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of names");
		int n = sc.nextInt();
		String names;
		String[] arr = new String[n];
		for(int i =0;i<n;i++) {
			names = sc.next();
			arr[i]=names;
		}
		int count=0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)==arr[i+1].charAt(0)) {
					count++;
					break;
				}
			}

			}
		
		if(count==(n-1)) {
			System.out.println("possible");
		}else {
			System.out.println("not possible");
			
		}
	}
}
