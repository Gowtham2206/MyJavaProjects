package vaantest;

import java.util.Scanner;

public class multidimenarr {

	public static void main(String[] args) {
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int temp=n-1;
		int sum =0;
		for (int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println("");
		}
		for (int z=0;z<n;z++) {
			sum += arr[z][temp];
			temp -= 1;
		}
		System.out.println(sum);
		
	}

}
