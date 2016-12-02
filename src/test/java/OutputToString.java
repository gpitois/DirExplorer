public class OutputToString implements OutputManager {
    String buffer;

    public void init() {
        buffer = "";
    }
    @Override
    public void output(String s) {
        buffer += s + " ";
    }

    public String getBuffer() {
        return buffer;
    }
}
