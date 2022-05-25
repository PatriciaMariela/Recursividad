package recursividad;

/**
 *
 * @author Pa
 *
 */


public class Factorial {
	public int factorial(int n) {
		if (n == 0) {//caso base
			return 1;
		} else {
			return n * factorial(n - 1);//caso recursivo
		}
	}
}
