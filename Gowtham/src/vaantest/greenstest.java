package vaantest;
import java.util.*;

public class greenstest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		String arr2[] = new String[n];
		
		for (int i=0;i<n;i++) {
			arr[i] =sc.next();
		}
		for(int j=0;j<n;j++) {
			String rev ="";
			String word = arr[j];			
			for(int z = (word.length()-1);z>=0;z--) {
				rev = rev + word.charAt(z);
				}
			arr2[j] = rev;
		}
		for(int g=0;g<n;g++) {
			if (arr[g].equals(arr2[g])) {
				System.out.println(arr[g] + " is palindrom");
				
			}
			else {
				System.out.println(arr[g]+ " is not palindrom");
			}
		}
	}
}
