package com.softgroup.test;

import org.junit.Assert;
import org.junit.Test;

public class RentalTest{
    @Test
    public void testAmountFor() throws Exception {
        int kind = 2;
        int days = 8;
        int basePrice = 100;
        Rental rental = new Rental(kind, days, basePrice);
        double expectedResult = 4800.0;
        Assert.assertEquals(expectedResult, rental.amountFor(), 0.0001);
    }
}
