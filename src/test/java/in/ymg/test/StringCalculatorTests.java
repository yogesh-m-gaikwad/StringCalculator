package in.ymg.test;

import in.ymg.app.StringCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The {@code StringCalculatorTests} class represents a string calculator test class.
 * <p>
 *
 * @author  Yogesh Gaikwad
 */
public class StringCalculatorTests {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    @DisplayName("an empty string returns 0")
    void emptyStringTest() {
        assertEquals(0, calculator.add(""), "empty string should return 0");
    }

    @Test
    @DisplayName("string with one number 7 returns the number as sum = 7")
    void oneIntegerStringToReturnTheNumberItSelfTest() {
        assertEquals(7, calculator.add("7"), "String '7'  should return 7");
    }

    @Test
    @DisplayName("string with two numbers 5,4 returns sum = 9")
    void twoIntegerStringToReturnSumScenarioOneTest() {
        assertEquals(9, calculator.add("5,4"), "String '5,4'  should return 9");
    }

    @Test
    @DisplayName("string with two numbers 15,27 returns sum = 42")
    void twoIntegerStringToReturnSumScenarioTwoTest() {
        assertEquals(9, calculator.add("15,27"), "String '15,27'  should return 42");
    }
}
