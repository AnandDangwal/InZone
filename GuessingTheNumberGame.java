package basic.apple;
import java.util.*;

class Game{
	public int totalGuesses=0;
	public int randNum;
	public int userInputNum;
	Scanner sc = new Scanner(System.in);
	public Game(){
		Random random = new Random();
		this.randNum = random.nextInt(101);
	}
	public void userInput() {
		System.out.println("From 1 to 100, what is your guess ? ");
		userInputNum = sc.nextInt();
	}
	public boolean isCorrect() {
		if(randNum==userInputNum) {
			return true;
		}
		else if (randNum>userInputNum) {
			System.out.println("Colder!");
		} 
		else if(randNum<userInputNum) {
			System.out.println("Warmer!");
		}
		return false;
		
	}
	public void setTotalGuesses() {
		totalGuesses += 1;
	}
	public int getTotalGuesses() {
		return totalGuesses;
	}
}
public class Cwh_Exercise3_GuessingTheNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game guessGame = new Game();
		boolean win = false;
		
		while(win!=true) {
			//taking user input again.
			guessGame.userInput();
			//incrementing no. of guesses by 1 for each user guess
			guessGame.setTotalGuesses();
			//checking whether user guess the number correct or not.
			if (guessGame.isCorrect()==true) {
				win = true;
			}
			else {
				win = false;
			}
			
		}
		if(guessGame.getTotalGuesses()==1) {
			System.out.println("You have taken only "+guessGame.getTotalGuesses()+" guesses.");
			System.out.println("You are legend");
		}
		else if(guessGame.getTotalGuesses()<5) {
			System.out.println("You have taken only "+guessGame.getTotalGuesses()+" guesses.");
			System.out.println("You got all 3 star.");
		}
		else if(guessGame.getTotalGuesses()>=5 && guessGame.getTotalGuesses()<10){
			System.out.println("You have taken only "+guessGame.getTotalGuesses()+" guesses.");
			System.out.println("You got 2 star ");
		}
		else {
			System.out.println("You have taken only "+guessGame.getTotalGuesses()+" guesses.");
			System.out.println("You got 1 star.");
		}
	}

}
