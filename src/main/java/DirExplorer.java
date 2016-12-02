import java.io.File;

/**
 * Interface that abstracts which algorithm is used to walk through the files tree.
 */
public interface DirExplorer {
    void explore(File file, FileDisplayer fileDisplayer, OutputManager outPut);
}
