
public class FractionTest {

	
	public static void main(String[] args){

		System.out.println("testing the sum:");
		
		Fraction myFraction = new Fraction(1, 5);
		Fraction myFraction2 = new Fraction(4, 16);
		Fraction result = myFraction2.sum(myFraction);
		
		System.out.print(myFraction.getNumerator() + "/" + myFraction.getDenominator());
		System.out.print(" + ");		
		System.out.print(myFraction2.getNumerator() + "/" + myFraction2.getDenominator());
		System.out.print(" = ");
		System.out.println(result.getNumerator() + "/" + result.getDenominator());
		
		System.out.println("testing the substraction:");
		
		Fraction resultSub = myFraction.minus(myFraction2);
		
		System.out.print(myFraction.getNumerator() + "/" + myFraction.getDenominator());
		System.out.print(" - ");		
		System.out.print(myFraction2.getNumerator() + "/" + myFraction2.getDenominator());
		System.out.print(" = ");
		System.out.println(resultSub.getNumerator() + "/" + resultSub.getDenominator());
		
		System.out.println("testing the multiplication:");
		
		Fraction resultTimes = myFraction.times(myFraction2);
		
		System.out.print(myFraction.getNumerator() + "/" + myFraction.getDenominator());
		System.out.print(" * ");		
		System.out.print(myFraction2.getNumerator() + "/" + myFraction2.getDenominator());
		System.out.print(" = ");
		System.out.println(resultTimes.getNumerator() + "/" + resultTimes.getDenominator());
		
		System.out.println("testing the division:");
		
		Fraction resultDiv = myFraction.divided(myFraction2);
		
		System.out.print(myFraction.getNumerator() + "/" + myFraction.getDenominator());
		System.out.print(" / ");		
		System.out.print(myFraction2.getNumerator() + "/" + myFraction2.getDenominator());
		System.out.print(" = ");
		System.out.println(resultDiv.getNumerator() + "/" + resultDiv.getDenominator());
	}
		
}
