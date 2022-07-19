/**
 */
public class StringUtils {
	public static String reverse(String str) {
		String rev = "";
//		char c [] = str.toCharArray();
//		for(int i = c.length-1; i >= 0; i--) {
//			rev += c[i];
//		}
		//System.out.println("Using StringBuilder");
		StringBuilder sb = new StringBuilder(str);
		rev = sb.reverse().toString();
		return rev;
	}
}
