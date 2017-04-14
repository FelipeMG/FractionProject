
public class ArithmeticOperationsTest {

	public static void main(String[] args) {
	
		int a = 8;
		int b = 6;
		int mcd = ArithmeticOperations.gcf(a, b);
		int mcm = ArithmeticOperations.lcm(a, b);
		
		System.out.println("mcm: "+mcm);
		System.out.println("mcd: "+mcd);
		
	}
	
}
