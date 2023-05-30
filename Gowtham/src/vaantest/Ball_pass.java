package vaantest;
import java.util.*;

public class Ball_pass {
	static int init_position = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of player: ");
		int nop = sc.nextInt(); //6
		String[] names = new String[nop];
	for (int i=0;i<nop;i++) {   //0 TO 5	
			System.out.println("Enter the name of player no: "+ (i+1));
			String players = sc.next();
			names[i]=players;
		}
		System.out.print("The players are: ");
		for(int j = 0; j< nop; j++) {
			System.out.print(names[j]+" ");
		}
		System.out.println("\nEnter the first player with the ball in hand currently: ");
		String init_player = sc.next();
		for(int z = 0;z<nop;z++) {
			if(init_player.equals(names[z])) {//F
				init_position = z; //4
			}
		}
		System.out.println("Initial position is: "+ init_position);
		System.out.print("Enter the numbe of passes: ");
		int pass = sc.nextInt(); //7
		int pass2 = pass*2; //14
		int fin_position1 = init_position + (pass2%nop); //4+2
		if(fin_position1>(nop-1)) { //6>5
			fin_position1 = fin_position1-(nop-1); //1
			System.out.println("The final player is: "+names[fin_position1-1]);
		}
		else{
			System.out.println("The final player is: " +names[fin_position1]);
		}

	}

}
