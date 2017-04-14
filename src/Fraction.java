public class Fraction {
   private int numerator;
   private int denominator;
   public Fraction(int numerator, int denominator) {
      final int GCF = ArithmeticOperations.gcf(numerator, denominator);
      this.numerator = numerator / GCF;
      this.denominator = denominator / GCF;
   }
   public int getNumerator() {
      return numerator;
   }
   public int getDenominator() {
      return denominator;
   }
}