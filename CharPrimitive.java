
public class CharPrimitive {
	public static void main(String [] args) {
		char c1 = 65; //Decimal value to character 'A'
		char c2 = 'A'; //character 'A'
		char c3 = '\u0041'; //Unicode value to character 'A'
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		char c4 = 8377; //Decimal value for Indian rupee symbol
		char c5 = '\u20B9'; //Unicode value for Indian rupee symbol
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		
		char c6 = 65535; //No error
		System.out.println("c6 = " + c6);
		
		//char c7 = 65536; //compilation error, out of range
		
		/* Assigning char literal to integral type. */
		byte i1 = 'A'; //corresponding decimal value is 65
		int i2 = '\u20B9'; //corresponding decimal value is 8377
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
	}

}
