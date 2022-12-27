package basic.apple;
import java.util.*;

public class Cwh_Exercise2_RockPaperScissor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Rock-Paper-Scissors Game.");
		System.out.println("0:Rock | 1:Paper | 2:Scissor");
		
		Dictionary d = new Hashtable<>();
		d.put(0,"Rock"); d.put(1, "Paper"); d.put(2, "Scissor");
		
		Random random = new Random();  int computer = random.nextInt(3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a number From 0 to 2: "); int player = sc.nextInt();
		
		System.out.println("Computer goes with "+d.get(computer));
		System.out.println("Player goes with "+d.get(player));
		
		switch (computer) {
			case 0:
				if (player==1) {
					System.out.println("Paper beaten Rock");  System.out.println("Player Wins");
				}
				else if (player==2) {
					System.out.println("Rock beaten Scissor");  System.out.println("Computer Wins");
				}
				else {
					System.out.println("Its a tie!");
				}
				break;
			
			case 1:
				if (player==0) {
					System.out.println("Paper beaten Rock");  System.out.println("Computer Wins");
				}
				else if (player==2) {
					System.out.println("Scissor beaten Paper");  System.out.println("Player Wins");
				}
				else {
					System.out.println("Its a tie!");
				}
				break;
			
			case 2:
				if (player==0) {
					System.out.println("Rock beaten Scissor");  System.out.println("Player Wins");
				}
				else if (player==1) {
					System.out.println("Scissor beaten Paper");  System.out.println("Computer Wins");
				}
				else {
					System.out.println("Its a tie!");
				}
				break;
		}
		sc.close();
	}
}
