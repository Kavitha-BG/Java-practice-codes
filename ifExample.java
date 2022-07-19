/**
 * Class to explain if statement
 * @author Kavitha_BG
 *
 */
public class ifExample {
	public static void main(String[] args) {
		int score = 50;
		
		if (score > 80)
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
		
		if (score > 80) {
			System.out.println("Excellent");
		}
		System.out.println("You passed with grade A");
		
		if (score > 80)
			System.out.println("Excellent");System.out.println("You passed with grade A");
	}
}