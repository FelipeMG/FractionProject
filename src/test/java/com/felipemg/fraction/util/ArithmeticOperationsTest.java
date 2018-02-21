package com.felipemg.fraction.util;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class ArithmeticOperationsTest {

    @Test
    public void gcfOf12And4Is4(){
        assertThat(ArithmeticOperations.gcf(12,4), is(4));
    }

    @Test
    public void gcfOf1And7Is1(){
        assertThat(ArithmeticOperations.gcf(1,7), is(1));
    }

    @Test
    public void gcfOf24And36Is12(){
        assertThat(ArithmeticOperations.gcf(24,36), is(12));
    }

    @Test
    public void gcfOf0And4Is4(){
        assertThat(ArithmeticOperations.gcf(0,4), is(4));
    }

    @Test
    public void lcmOf0And7Is0(){
        assertThat(ArithmeticOperations.lcm(0, 7), is(0));
    }

    @Test
    public void lcmOf10And5Is10(){
        assertThat(ArithmeticOperations.lcm(10, 5), is(10));
    }

    @Test
    public void lcmOf8And6Is24(){
        assertThat(ArithmeticOperations.lcm(8, 6), is(24));
    }

    @Test
    public void gcfOf8And6Is2(){
        assertThat(ArithmeticOperations.gcf(8, 6), is(2));
    }

    @Test
    public void lcmOf7And1Is7(){
        assertThat(ArithmeticOperations.lcm(7, 1), is(7));
    }

}
