package com.felipemg.fraction.util;

public final class ArithmeticOperations {
	
	private ArithmeticOperations() {
		throw new AssertionError("This class shouldn't be instantiated");
	}
	
	public static int gcf(int a, int b) {
	      return b == 0 ? a : gcf(b, a % b);
	}
	
	public static int lcm(int a, int b) {
	      return (b == 0) || (a == 0) ? 0 : a * b / gcf(a, b);
	}

}
