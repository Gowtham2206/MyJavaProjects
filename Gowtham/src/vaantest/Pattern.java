package vaantest;
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
//		for (int j = 1; j < 8; j++) {
//			if (j % 2 != 0) {
//				for (int k = 1; k <= j; k++) {
//					System.out.print("*");
//				}
//				System.out.print("\n");
//			}
//		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 for (int i=0; i<n; i++) 
	        { 
	            for (int j=n-i; j>1; j--) 
	                System.out.print(" "); 
	            for (int j=0; j<=i; j++ ) 
	                System.out.print(" *"); 
	            System.out.println(); 
	        }
	}



}
