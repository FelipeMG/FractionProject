package com.felipemg.fraction;

public class Fraction {
   private int numerator;
   private int denominator;
   public Fraction(int numerator, int denominator) {
	   if(denominator != 0){		
		   final int GCF = ArithmeticOperations.gcf(numerator, denominator);
		   this.numerator = numerator / GCF;
		   this.denominator = denominator / GCF;		   
	   }
	   else{
		   throw new IllegalArgumentException("Denominator can't be 0");
	   }
   }
   public Fraction plus(Fraction that) {
	   final int LCM = ArithmeticOperations.lcm(this.denominator, that.denominator);
	   final int numerator = LCM / this.denominator * this.numerator 
		   + LCM / that.denominator * that.numerator;
	   return new Fraction(numerator, LCM);
   }
   public Fraction minus(Fraction that) {
	   return this.plus(that.negative());
   }
   public Fraction times(Fraction that) {
	   final int numerator = this.numerator * that.numerator;
	   final int denominator = this.denominator * that.denominator;
	   return new Fraction(numerator, denominator);
   }
   public Fraction divided(Fraction that) {
	   return this.times(that.inverse());
   }
   public Fraction negative() {
	   return new Fraction(this.numerator * -1, this.denominator);
   }
   public Fraction inverse() {
	   return new Fraction(this.denominator, this.numerator);
   }
   public int getNumerator() {
      return numerator;
   }
   public int getDenominator() {
      return denominator;
   }
   
   
}