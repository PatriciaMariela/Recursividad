package recursividad;

/**
 *
 * @author Pa
 *
 */

public class Fibonacci {

	@SuppressWarnings("unused")
	private int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}else {
			return (fibonacci(n - 1) + fibonacci(n - 2));
		}
	}
}
