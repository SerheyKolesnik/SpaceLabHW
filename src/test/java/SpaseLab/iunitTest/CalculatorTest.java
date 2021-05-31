package SpaseLab.iunitTest;

import SpaseLab.simple_iunit.Calculator;
import junit.framework.TestCase;
import org.junit.*;

public class CalculatorTest extends TestCase {
    private Calculator calculator = new Calculator();

    @After
    public void afterTest() {
        calculator = null;
    }

    @Before
    public void initTest() {

        calculator = new Calculator();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After CalculatorTest");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest");
    }

    @Test
    public void testGetSum() {

        assertEquals(15, calculator.getSum(8, 7));
    }

    @Test
    public void testGetDivide() {

        assertEquals(5, calculator.getDivide(10, 5));
    }

    @Test
    public void testGetMultiple() {

        assertEquals(6, calculator.getMultiple(2, 3));
    }
}