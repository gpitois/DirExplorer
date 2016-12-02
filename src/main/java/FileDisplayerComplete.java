import java.io.File;
import java.text.SimpleDateFormat;

public class FileDisplayerComplete implements FileDisplayer {
    private static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    @Override
    public String displayInfo(File f) {
        return f.getName() + " " + f.length() + " " + sdf.format(f.lastModified());
    }
}
