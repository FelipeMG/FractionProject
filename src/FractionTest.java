
public class FractionTest {

	
	public static void main(String[] args){

		System.out.println("testing the sum of 2 fractions:");
		
		Fraction myFraction = new Fraction(1, 5);
		Fraction myFraction2 = new Fraction(4, 16);
		Fraction result = myFraction2.sum(myFraction);
		
		System.out.print(myFraction.getNumerator() + "/" + myFraction.getDenominator());
		System.out.print(" + ");		
		System.out.print(myFraction2.getNumerator() + "/" + myFraction2.getDenominator());
		System.out.print(" = ");
		System.out.print(result.getNumerator() + "/" + result.getDenominator());
	}
		
}
