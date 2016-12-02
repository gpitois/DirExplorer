import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the BFS tree walk algorithm
 */
public class DirExplorerBfsTest {
    private File root;
    private OutputToString outputToString;
    private FileDisplayerSimple fileDisplayerSimple;
    private DirExplorerBfs dirExplorerBfs;

    private static final String BFS_OUTPUT = "root a b aa ab ba ";

    @Before
    public void setUp() throws Exception {
        root = new File("root");
        root.mkdir();
        File a = new File(root, "a");
        a.mkdir();
        File b = new File(root, "b");
        b.mkdir();
        File aa = new File(a, "aa");
        aa.mkdir();
        File ab = new File(a, "ab");
        ab.mkdir();
        File ba = new File(b, "ba");
        ba.mkdir();

        outputToString = new OutputToString();
        outputToString.init();
        fileDisplayerSimple = new FileDisplayerSimple();
        dirExplorerBfs = new DirExplorerBfs();
    }

    @Test
    public void explore() throws Exception {
        dirExplorerBfs.explore(root, fileDisplayerSimple, outputToString);
        assertEquals(BFS_OUTPUT, outputToString.getBuffer());
    }
}