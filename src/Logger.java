import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instanse = null;
    protected int num = 1;
    protected SimpleDateFormat formarter = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    protected Date date = new Date();

    private Logger() {}

    public void log(String msg) {
        System.out.println(formarter.format(date) + " [" + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instanse == null) instanse = new Logger();
        return instanse;
    }
}
