package in.ymg.test;

import in.ymg.app.StringCalculator;
import in.ymg.app.exceptions.NegativeNumberNotAllowedException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    @DisplayName("string with two numbers having newline in between '5\\n7' returns correct sum = 12")
    void twoIntegersWithNewLineInBetweenToReturnSumTest() {
        assertEquals(12, calculator.add("5\n7"), "String '5\\n7' should return 12");
    }

    @Test
    @DisplayName("string with two numbers with newlines in between '5\\n7\\n9,2' returns correct sum = 23")
    void moreThanTwoIntegersWithNewLineInBetweenToReturnSumTest() {
        assertEquals(23, calculator.add("5\n7\n9,2"), "String '5\\n7\\n9,2' should return 23");
    }

    @Test
    @DisplayName("string with custom delimiter and two numbers '//|55|21' returns correct sum = 76")
    void customDelimiterSpecifierStringWithTwoNumbersSumTest() {
        assertEquals(76, calculator.add("//|\n55|21"), "String '//|\n55|21' should return 76");
    }

    @Test
    @DisplayName("string with custom delimiter but no data '//|' returns sum = 0")
    void customDelimiterSpecifierStringWithNoNumbersSumTest() {
        assertEquals(0, calculator.add("//|"), "String '//|' should return 0");
    }

    @Test
    @DisplayName("string with custom delimiter but no data on newline '//|\\n' returns sum = 0")
    void customDelimiterSpecifierStringWithNoNumbersOnNewLineSumTest() {
        assertEquals(0, calculator.add("//|\n"), "String '//|\\n' should return 0");
    }

    @Test
    @DisplayName("string with custom delimiter and multiple numbers  '//;\\n10;3;7;5' returns sum = 25")
    void customDelimiterSpecifierStringWithMultipleNumbersSumTest() {
        assertEquals(25, calculator.add("//;\n10;3;7;5"), "String '//;\\n10;3;7;5' should return 25");
    }

    @Test
    @DisplayName("string with custom delimiter and multiple numbers  '//;\\n10.3.7.5' returns sum = 25")
    void customDelimiterSpecifierStringWithMultipleNumbersScenarioTwoSumTest() {
        assertEquals(25, calculator.add("//.\n10.3.7.5"), "String '//;\\n10.3.7.5' should return 25");
    }

    @Test
    @DisplayName("string with negative numbers should throw exception")
    void stringWithNegativeNumberToThrowExceptionTest() {
        Throwable exception = assertThrows(NegativeNumberNotAllowedException.class, () -> {
            calculator.add("-10");
        }, "String with negative number should throw expected exception");

        assertEquals("negatives not allowed -10", exception.getMessage(), "exception message should match 'negatives not allowed -10'");
    }

    @Test
    @DisplayName("string with negative numbers using custom delimiter should throw exception")
    void stringWithNegativeNumberWithCustomDelimiterToThrowExceptionTest() {
        Throwable exception = assertThrows(NegativeNumberNotAllowedException.class, () -> {
            calculator.add("//;\n10;-42");
        }, "String with negative number using custom delimiter should throw expected exception");

        assertEquals("negatives not allowed -42", exception.getMessage(), "exception message should match 'negatives not allowed -42'");
    }
}