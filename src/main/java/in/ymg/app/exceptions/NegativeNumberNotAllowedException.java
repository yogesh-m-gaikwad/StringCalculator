package in.ymg.app.exceptions;

/**
 * Thrown to indicate that a negative number is specified when it is not allowed.
 *
 * @author Yogesh Gaikwad
 */
public class NegativeNumberNotAllowedException extends Exception {

    private static final long serialVersionUID = 1701871014005510395L;

    public NegativeNumberNotAllowedException() {
        super();
    }

    public NegativeNumberNotAllowedException(String message) {
        super(message);
    }
}
