
public class SwitchExample {
	public static void main(String [] args) {
		String colorCode = "g";		
		switch(colorCode) { //switch expression in String type
			case "R": System.out.println("Traffic light is RED");
						break;
			case "r": System.out.println("Traffic light is RED");
						break;
			case "O": System.out.println("Traffic light is ORANGE");
						break;	
			case "o": System.out.println("Traffic light is ORANGE");
						break;
			case "G": System.out.println("Traffic light is GREEN");
						break;
			case "g": System.out.println("Traffic light is GREEN");
						break;
			default: System.out.println("Invalid color code");
						break;
						
		}
	}
}
