package in.ymg.app;

import sun.misc.Regexp;

import java.util.regex.Pattern;

/**
 * The {@code StringCalculator} class represents a string calculator.
 * <p>
 * Use the add method to do the work. For example:
 * <blockquote><pre>
 *     StringCalculator c = new StringCalculator();
 *     c.add("3,6");
 * </pre></blockquote><p>
 *
 * @author Yogesh Gaikwad
 */
public class StringCalculator {

    /**
     * Custom delimiter specifier to be used in string.
     */
    private final String CUSTOM_DELIMITER_SPECIFIER = "//";

    public int add(String numbers) {
        int sum = 0;
        if (numbers != null && !numbers.isEmpty()) {
            if (numbers.startsWith(CUSTOM_DELIMITER_SPECIFIER)) {
                int charToSkip = CUSTOM_DELIMITER_SPECIFIER.length();
                if (numbers.length() > (charToSkip + 1)) {
                    String delimiter = numbers.substring(charToSkip, charToSkip + 1);
                    numbers = numbers.substring(charToSkip + 2);
                    String delimiters = "[,\n" + delimiter + "]";
                    sum = parseAndAdd(numbers, delimiters);
                }
            } else {
                sum = parseAndAdd(numbers, "[,\n]");
            }
        }

        return sum;
    }

    private int parseAndAdd(String numbers, String regEx) {
        int sum = 0;
        if (numbers != null && !numbers.isEmpty()) {
            String[] numberArray = numbers.split(regEx);
            for (String n : numberArray) {
                int num = Integer.parseInt(n);
                sum += num;
            }
        }
        return sum;
    }
}