package ss9_testing_tdd.nextdaycalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class NextDayCalculatorTest {
    @Test
    public void testNextDay() {
        assertEquals("2/1/2018", NextDayCalculator.getNextDay(1, 1, 2018));
    }

    @Test
    public void testEndOfMonth() {
        assertEquals("1/2/2018", NextDayCalculator.getNextDay(31, 1, 2018));
    }

    @Test
    public void testEndOfYear() {
        assertEquals("1/1/2019", NextDayCalculator.getNextDay(31, 12, 2018));
    }

    @Test
    public void testEndOfMonth4() {
        assertEquals("1/5/2018", NextDayCalculator.getNextDay(30, 4, 2018));
    }

    @Test
    public void testEndOfMonth2() {
        assertEquals("1/3/2018", NextDayCalculator.getNextDay(28, 2, 2018));
    }

    @Test
    public void testEndOfMonth2LeapYear() {
        assertEquals("29/2/2020", NextDayCalculator.getNextDay(28, 2, 2020));
    }
}
