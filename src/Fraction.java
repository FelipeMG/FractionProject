public class Fraction {
   private int numerator;
   private int denominator;
   public Fraction(int numerator, int denominator) {
      final int GCF = ArithmeticOperations.gcf(numerator, denominator);
      this.numerator = numerator / GCF;
      this.denominator = denominator / GCF;
   }
   public Fraction sum(Fraction that) {
	      final int LCM = ArithmeticOperations.lcm(this.denominator, that.denominator);
	      final int numerator = LCM / this.denominator * this.numerator
	            + LCM / that.denominator * that.numerator;
	      return new Fraction(numerator, LCM);
   }   
   public int getNumerator() {
      return numerator;
   }
   public int getDenominator() {
      return denominator;
   }
   
   
}