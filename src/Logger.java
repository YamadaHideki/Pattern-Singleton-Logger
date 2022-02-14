public class Logger {
    private static Logger instanse = null;
    protected int num = 1;

    private Logger() {}

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instanse == null) instanse = new Logger();
        return instanse;
    }
}
