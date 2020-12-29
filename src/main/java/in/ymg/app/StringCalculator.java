package in.ymg.app;

/**
 * The {@code StringCalculator} class represents a string calculator.
 * <p>
 * Use the add method to do the work. For example:
 * <blockquote><pre>
 *     StringCalculator c = new StringCalculator();
 *     c.add("3,6");
 * </pre></blockquote><p>
 *
 * @author  Yogesh Gaikwad
 */
public class StringCalculator {
    public int add(String numbers){
        int sum = 0;
        if( numbers != null && !numbers.isEmpty()) {
            String[] numberArray = numbers.split(",");
            for (String n : numberArray) {
                int num = Integer.parseInt(n);
                sum += num;
            }
        }

        return sum;
    }
}