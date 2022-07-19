
public class BytePrimitive {
	public static void main(String [] args) {
		byte b1 = -25;
		byte b2 = -0b11001;
		byte b3 = -0x19;
		byte b4 = -031;
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		
//		byte b5= 128; //out of range
//		byte b5 = -129; //out of range
	}
}
