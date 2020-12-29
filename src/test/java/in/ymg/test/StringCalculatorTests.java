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
    @Test
    @DisplayName("an empty string returns 0")
    void emptyStringTest() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""), "empty string should return 0");
    }
}
