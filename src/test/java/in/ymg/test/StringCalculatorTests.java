package in.ymg.test;

import in.ymg.app.StringCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The {@code StringCalculatorTests} class represents a string calculator test class.
 * <p>
 *
 * @author Yogesh Gaikwad
 */
public class StringCalculatorTests {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    @DisplayName("an empty string returns 0")
    void emptyStringTest() {
        assertEquals(0, calculator.add(""), "empty string should return 0");
    }

    @Test
    @DisplayName("a 0 string returns 0")
    void zeroStringTest() {
        assertEquals(0, calculator.add(""), "0 string should return 0");
    }

    @Test
    @DisplayName("string with one number 7 returns the number as sum = 7")
    void oneIntegerStringToReturnTheNumberItSelfTest() {
        assertEquals(7, calculator.add("7"), "String '7'  should return 7");
    }

    @Test
    @DisplayName("string with two numbers 5,4 returns sum = 9")
    void twoIntegersStringToReturnSumScenarioOneTest() {
        assertEquals(9, calculator.add("5,4"), "String '5,4'  should return 9");
    }

    @Test
    @DisplayName("string with two numbers 15,27 returns sum = 42")
    void twoIntegersStringToReturnSumScenarioTwoTest() {
        assertEquals(42, calculator.add("15,27"), "String '15,27'  should return 42");
    }

    @Test
    @DisplayName("string with numbers 1,2,3,4,5,6,7,8,9,10 returns sum = 55")
    void moreThanTwoIntegersStringToReturnCorrectSumTest() {
        assertEquals(55, calculator.add("1,2,3,4,5,6,7,8,9,10"), "String '1,2,3,4,5,6,7,8,9,10'  should return 55");
    }

    @Test
    @DisplayName("string with unordered numbers 10,2,1,4,5,6,8,7,9,3 returns sum = 55")
    void moreThanTwoUnOrderedIntegersStringToReturnCorrectSumTest() {
        assertEquals(55, calculator.add("10,2,1,4,5,6,8,7,9,3"), "String '10,2,1,4,5,6,8,7,9,3'  should return 55");
    }

    @Test
    @DisplayName("string with two numbers having newline in between '5,\\n7' returns correct sum = 12")
    void twoIntegersWithNewLineInBetweenToReturnSumTest() {
        assertEquals(12, calculator.add("5\n,7"), "String '5,\\n7'  should return 12");
    }

    @Test
    @DisplayName("string with two numbers with multiple newlines in between '5,\\n7\\n9,2' returns correct sum = 23")
    void moreThanTwoIntegersWithNewLineInBetweenToReturnSumTest() {
        assertEquals(23, calculator.add("5,\n7\n9,2"), "String '5,\\n7\\n9,2'  should return 23");
    }
}
