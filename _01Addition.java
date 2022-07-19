
public class _01Addition {
	public static void main(String [] args) {
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		String msg = "HELLO ";
		
		//Addition
		int res1 = i1 + i2; //Result of expression is int
		float res2 = i1 + f1; //Result of expression is float
		double res3 = i2 + d1; //Result of expression is double
		String res4 = msg + f1; //Result of expression is String
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
		System.out.println("---------------------------");
		
		byte b1 = 12;
		byte b2 = 20;
		
		
		byte res5 = (byte) (b1 + b2);//Casting is required
		byte res6 = (byte) (b1 + 0); //Casting is required
		byte res7 = 126 + 1; //No casting required (127 is within the byte range)
		byte res8 = (byte) (126 + 19); //Casting is needed as result(145) is out of byte range
		
		System.out.println("res = " + res5);
		System.out.println("res = " + res6);
		System.out.println("res = " + res7);
		System.out.println("res = " + res8);
		
		
	}
}
