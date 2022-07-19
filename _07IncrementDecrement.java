
public class _07IncrementDecrement {
	public static void main(String [] args) {
		int i = 10, j = 5;
		i++; // same as i = (int) (i + 1);
		--j; // same as j = (int) (j-1);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		// i=11, j=4
		int res = i++ + --j;
		
		System.out.println("res = " + res);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
}
