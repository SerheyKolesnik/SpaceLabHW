package SpaseLab.iunitTest;

import SpaseLab.simple_iunit.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestHillel {
    int x;
    int y;

    @Before
    public void setUp() {
        x = 5;
        y = 3;
    }

    @Test
    public void testAdd() {
        int res = 8;
        Assert.assertEquals("5 + 3 must be 8, but is " + Calculator.getSum(x, y), res, Calculator.getSum(x, y));
    }

    @Test
    public void testDiv() {
        int res = 2;
        Assert.assertEquals("5 - 3 must be 2, but is " + Calculator.getDivide(x, y), res, Calculator.getDivide(x, y));
    }

    @Test
    public void testMul() {
        int res = 15;
        Assert.assertEquals("5 * 3  must be 15, but is " + Calculator.getMultiple(x, y), res, Calculator.getMultiple(x, y));
    }

}
