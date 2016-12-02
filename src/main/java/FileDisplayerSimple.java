import java.io.File;

public class FileDisplayerSimple implements FileDisplayer {
    @Override
    public String displayInfo(File f) {
        return f.getName();
    }
}
