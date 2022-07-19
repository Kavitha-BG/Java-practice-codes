
public class SwitchExample2 {
	public static void main(String [] args) {
		String colorCode = "a";		
		switch(colorCode) { //switch expression in String type
			case "R": 
			case "r": System.out.println("Traffic light is RED");
						break;
			case "O": 
			case "o": System.out.println("Traffic light is ORANGE");
						break;
			case "G":
			case "g": System.out.println("Traffic light is GREEN");
						break;
			default: System.out.println("Invalid color code");
						break;
						
		}
	}
}
