public class FileLogger implements Logger {
    public void log(String msg) {
        System.out.println("[FILE LOG] " + msg + " => saved to file");
    }
}
