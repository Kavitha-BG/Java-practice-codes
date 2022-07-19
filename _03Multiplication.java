
public class _03Multiplication {
	public static void main(String [] args) {
		int i1 = 6;
		int i2 = 12;
		float f1 = 15.6f;
		double d1 = 25.5;
		
		int res1 = i1 * i2;
		float res2 = i1 * f1;
		double res3 = i1 * d1;
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
		
		byte b1 = 20;
		byte b2 = 2;
		
		byte res4 = (byte) (b1 * b2);//casting is required
		System.out.println("res4 = " + res4);
		
		i1 = 1000000; //Re-assignment
		i2 = 5000; //Re-assignment
		res1 = i1 * i2; // Result is out of int range
	}
}
