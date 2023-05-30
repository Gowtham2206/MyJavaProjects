package vaantest;


public class palindrome {

	public static void main(String[] args) {
		int a = 56765;
		String b = String.valueOf(a);
		char[] arr = b.toCharArray();
		String a2 = "";
		
		for(int i = (arr.length-1); i>=0;i--) {
			  a2 = a2 + arr[i];
			}
		Integer c = Integer.parseInt(a2);
		
		if(c == a) {
			System.out.println("They are palindrom");
		}
		else {
			System.out.println("They are not palindrome");
		}
		
		}

}
