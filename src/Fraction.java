public class Fraction {
   private int numerator;
   private int denominator;
   public Fraction(int numerator, int denominator) {
      final int GCF = gcf(numerator, denominator);
      this.numerator = numerator / GCF;
      this.denominator = denominator / GCF;
   }
   private static int gcf(int a, int b) {
      return b == 0 ? a : gcf(b, a % b);
   }
   public int getNumerator() {
      return numerator;
   }
   public int getDenominator() {
      return denominator;
   }
}