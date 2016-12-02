import java.io.File;

/**
 * This class is a composite that can accept different setup:
 * - display only file names OR display more details about files
 * - using the DFS walk through OR using the BFS
 * - writing the output to different output streams (console OR String)
 * Once the configuration is set up, we can apply the run() method.
 */
public class CodingChallenge {
    private FileDisplayer fileDisplayer;
    private DirExplorer dirExplorer;
    private OutputManager outputManager;

    void run(File file) {
        dirExplorer.explore(file, fileDisplayer, outputManager);
    }

    void setFileDisplayer(FileDisplayer fileDisplayer) {
        this.fileDisplayer = fileDisplayer;
    }

    void setDirExplorer(DirExplorer dirExplorer) {
        this.dirExplorer = dirExplorer;
    }

    void setOutputManager(OutputManager outputManager) {
        this.outputManager = outputManager;
    }
}
