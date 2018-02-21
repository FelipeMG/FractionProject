package com.felipemg.fraction;

import com.felipemg.fraction.util.ArithmeticOperations;

public final class Fraction {

    private int numerator;
    private int denominator;

    private Fraction(int numerator, int denominator) {
        if(denominator != 0){
            final int GCF = ArithmeticOperations.gcf(numerator, denominator);
            this.numerator = numerator / GCF;
		    this.denominator = denominator / GCF;
        }
	    else{
		    throw new IllegalArgumentException("Denominator can't be 0");
	    }
    }

    public static Fraction of(final int numerator, final int denominator){
        return new Fraction(numerator, denominator);
    }

    public static Fraction of(final int numerator){
        return new Fraction(numerator, 1);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}