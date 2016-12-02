import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 * This class implements a BFS tree walk through
 */
public class DirExplorerBfs implements DirExplorer {
    @Override
    public void explore(File file, FileDisplayer fileDisplayer, OutputManager outputManager) {
        outputManager.output(fileDisplayer.displayInfo(file));

        Queue<File> queue = new LinkedList<>();
        queue.offer(file);

        while (!queue.isEmpty()) {
            File f = queue.poll();
            File[] children = f.listFiles();
            if (children != null) {
                for (File child : children) {
                    outputManager.output(fileDisplayer.displayInfo(child));
                    if (child.isDirectory()) {
                        queue.offer(child);
                    }
                }
            }
        }
    }
}
