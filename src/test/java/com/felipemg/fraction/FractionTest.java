package com.felipemg.fraction;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class FractionTest {

    @Test(expected = IllegalArgumentException.class)
    public void twoOverZeroIsNotAFraction(){
        Fraction twoOverZero = Fraction.of(2, 0);
        assertThat(twoOverZero, is(twoOverZero));
    }

    @Test
    public void twoFourthsIsOneHalf(){
        Fraction twoFourths = Fraction.of(2, 4);
        Fraction oneHalf = Fraction.of(1, 2);
        assertThat(twoFourths, is(oneHalf));
    }

    @Test
    public void oneHalfPlus1IsThreeHalves(){
        Fraction oneHalf = Fraction.of(1, 2);
        Fraction oneUnit = Fraction.of(1);
        Fraction threeHalves = Fraction.of(3, 2);
        assertThat(oneHalf.plus(oneUnit), is(threeHalves));
    }

    @Test
    public void threeFourthsMinusOneHalfIsOneFourth(){
        Fraction threeFourths = Fraction.of(3, 4);
        Fraction oneFourth = Fraction.of(1, 4);
        Fraction oneHalf = Fraction.of(1, 2);
        assertThat(threeFourths.minus(oneHalf), is(oneFourth));
    }

    @Test
    public void oneFifthTimes3IsThreeFifths(){
        Fraction threeFifths = Fraction.of(3, 5);
        Fraction oneFifth = Fraction.of(1, 5);
        Fraction three = Fraction.of(3);
        assertThat(oneFifth.times(three), is(threeFifths));
    }

    @Test
    public void twoThirdsDivided2IsOneThird(){
        Fraction twoThirds = Fraction.of(2, 3);
        Fraction oneThird = Fraction.of(1, 3);
        Fraction two = Fraction.of(2);
        assertThat(twoThirds.divided(two), is(oneThird));
    }

    @Test
    public void negativeOfOneHalfIsMinusOneHalf(){
        Fraction oneHalf = Fraction.of(1, 2);
        Fraction minusOneHalf = Fraction.of(-1, 2);
        assertThat(oneHalf.negative(), is(minusOneHalf));
    }

    @Test
    public void inverseOfTwoThirdsIsThreeHalves(){
        Fraction twoThirds = Fraction.of(2, 3);
        Fraction threeHalves = Fraction.of(3, 2);
        assertThat(twoThirds.inverse(), is(threeHalves));
    }

    @Test
    public void inverseOfMinusTwoThirdsIsMinusThreeHalves(){
        Fraction minusTwoThirds = Fraction.of(-2, 3);
        Fraction minusThreeHalves = Fraction.of(-3, 2);
        assertThat(minusTwoThirds.inverse(), is(minusThreeHalves));
    }

}
