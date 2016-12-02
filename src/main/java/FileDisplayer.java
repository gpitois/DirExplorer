import java.io.File;

/**
 * Interface that abstract which method is used to print a file's details.
 */
public interface FileDisplayer {
    String displayInfo(File f);
}
