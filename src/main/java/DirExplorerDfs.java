import java.io.File;

/**
 * This class implements a DFS tree walk through
 */
public class DirExplorerDfs implements DirExplorer {
    @Override
    public void explore(File file, FileDisplayer fileDisplayer, OutputManager outputManager) {
        exploreDfs(file, fileDisplayer, outputManager);
    }

    private void exploreDfs(File inputFile, FileDisplayer fileDisplayer, OutputManager outputManager) {
        if (inputFile.isDirectory()) {
            // Prefix display of the directory name before exploring its children.
            outputManager.output(fileDisplayer.displayInfo(inputFile));
            File[] fileList = inputFile.listFiles();
            if (fileList != null) {
                for (File f : fileList) {
                    exploreDfs(f, fileDisplayer, outputManager);
                }
            }
        } else {
            outputManager.output(fileDisplayer.displayInfo(inputFile));
        }
    }
}
