
public class IfElseExample {
	public static void main(String [] args) {
		byte hour = 16;
		
		if( hour < 12) {
			System.out.println("Good Morning");
		}
		
		else if (hour < 15){
			System.out.println("Good Afternoon");
		}
		 
		else {	//hour >=15
			System.out.println("Good Evening");
		}
	}
}
