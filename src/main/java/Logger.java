import java.time.LocalDate;
import java.time.LocalTime;

public class Logger {
    protected int num = 1;

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + LocalDate.now() + " "
                + LocalTime.now() + " "
                + num++ + "] "
                + msg);
    }
}
