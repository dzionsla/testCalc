package pl.edu.agh.mwo.calculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

//    @Before
//    public void before() {
//        System.out.println("@BeforeClass: onceExecutedBeforeAll");
//    }


    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.sum(5,7));
        System.out.println("add");
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.subtract(10,7));
        System.out.println("sub");
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5,5));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.divide(100,10));
    }

    @Test(expected = Exception.class)
    public void testDivideByZero() { 
        Calculator calc = new Calculator();
        calc.divide(5,0);
        //assertEquals(10, calc.divide(5,0));
    }


}
