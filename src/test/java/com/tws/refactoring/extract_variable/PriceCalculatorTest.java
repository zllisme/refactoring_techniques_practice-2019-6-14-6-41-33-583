package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void should_return_90_when_calculate_price_given_twe_argument_10() {
        //given
        PriceCalculator priceCalculator = new PriceCalculator();
        //when
        double result = priceCalculator.getPrice(10,10);
        //then
        assertEquals(110, result, 0.01);

    }
}