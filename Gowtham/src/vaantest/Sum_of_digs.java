package vaantest;

public class Sum_of_digs {

	public static void main(String[] args) {
		int num = 12345;
		String num2 = String.valueOf(num);
		String[] arr = num2.split("");
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+ Integer.parseInt(arr[i]);
			
		}
		System.out.println(sum);
		

	}

}
