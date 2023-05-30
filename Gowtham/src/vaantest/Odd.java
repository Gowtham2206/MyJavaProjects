package vaantest;

public class Odd {

	public static void main(String[] args) {
		String line = "I am a software engineer";
		String[] arr = line.split(" ");
		String[] arr2 = new String[arr.length];
		for(int i = 0; i < arr.length;i++) {
			if(i%2==0) {
				arr2[i] = arr[i] + " ";
			}
			else {
				String rev = "";
				String org = arr[i];
				for(int j = (org.length()-1);j>=0;j--) {
					rev = rev+org.charAt(j);
					
			}
				arr2[i] = rev + " "; }
		}
	
		
		for(int z=0;z<arr2.length;z++) {
			System.out.print(arr2[z]);
		}
		}


}
