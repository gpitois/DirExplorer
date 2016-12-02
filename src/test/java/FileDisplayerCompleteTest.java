import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the utility that displays a file name with details
 */
public class FileDisplayerCompleteTest {
    private File f;
    private String timeStamp;

    @Before
    public void setUp() throws Exception {
        f = new File("testFile");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        timeStamp = sdf.format(f.lastModified());
    }

    @Test
    public void displayInfo() throws Exception {
        FileDisplayerComplete fileDisplayerComplete = new FileDisplayerComplete();
        String output = fileDisplayerComplete.displayInfo(f);
        String testOutput = "testFile 0 " + timeStamp;
        assertEquals(testOutput, output);
    }

    @After
    public void tearDown() {
        f.delete();
    }
}