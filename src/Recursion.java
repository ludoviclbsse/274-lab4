public class Recursion {
	public static void main(String[] args) {
		if (addDigits(428) == 14) {
			System.out.println("addDigits is correct!");
		}
		if (revFibonacci(0, 1, 1, 5) == 5) {
			System.out.println("revFib is correct!");
		}
		if (binToDec("1101100") == 108) {
			System.out.println("binToDec is correct!");
		}
	}
	
	/**Finds the Sum of the digits of num
	* @param num value to find the sum of
	* @return the sum of the digits
	*/
	public static int addDigits(int num) {
		if (num > 0) {
			return num % 10 + addDigits(num/10);
		} else
			return num;
	}
	
	/**Finds the nth Fibonacci value
	* @param f1 n-2 Fibonacci value
	* @param f2 n-1 Fibonacci value
	* @param c counter
	* @param n the number c should count up to
	* @return the nth Fibonacci value
	*/
	public static int revFibonacci(int f1, int f2, int c, int n) {
		if (c < n) {
			return revFibonacci(f2, f1+f2, c+1, n);
		} else
			return f2;
	}
	
	/**Converts a binary string to decimal
	* @param bin the binary string
	* @return the decimal value
	*/
	public static int binToDec(String bin) {
		int len = bin.length();
		if (len == 0)
			return 0;
		String now = bin.substring(0, 1);
		String later = bin.substring(1);
		return Integer.parseInt(now) * (int) Math.pow(2, len - 1) + binToDec(later);
	}
}