package basic.apple;
import java.util.*;
public class BoardMarks_Percentage_Calcutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float english = sc.nextInt();
		float hindi = sc.nextInt();
		float science = sc.nextInt();
		float math = sc.nextInt();
		float socialScience = sc.nextInt();
		
		float percentage = ((english+hindi+science+math+socialScience)/5);
		
		System.out.println(percentage);
		System.out.println(7*8);
		
		sc.close();
	}
 	
}
