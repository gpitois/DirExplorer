/**
 * Interface that abstract where the output is written. This decoupling was necessary to create unit tests for
 * the tree walk algorithms.
 */
public interface OutputManager {
    void output(String s);
}
