import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the utility that only displays a file name
 */
public class FileDisplayerSimpleTest {
    private File f;

    @Before
    public void setUp() throws Exception {
        f = new File("testFile");
    }

    @Test
    public void displayInfo() throws Exception {
        FileDisplayerSimple fileDisplayerSimple = new FileDisplayerSimple();
        String output = fileDisplayerSimple.displayInfo(f);
        assertEquals("testFile", output);
    }

    @After
    public void tearDown() {
        f.delete();
    }
}