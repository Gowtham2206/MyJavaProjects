package vaantest;

public class pattern2 {

	public static void main(String[] args) {
		int n = 6;
		int n2 = -1;
		int n3 = (n*2)-1;
//		---------------------------------------
		for(int i = n;i>0;i--) {
			for(int k=i;k>0;k--) {
				System.out.print(" ");
			}

			n2 += 2;
			for(int j = 0;j<n2;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
//		---------------------------------------
		for(int i = 0;i<n;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}			
			for(int j = n3;j>0;j--) {
				System.out.print("*");
			}
			n3 -= 2;
			System.out.print("\n");
		}

	}

}
