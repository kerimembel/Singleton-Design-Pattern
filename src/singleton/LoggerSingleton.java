package singleton;

import static singleton.Constants.*;

public class LoggerSingleton {

    private static LoggerSingleton logger;

    private LoggerSingleton() {}

    public static LoggerSingleton getLogger() {
        if(logger == null) {
            logger = new LoggerSingleton();
        }
        return logger;
    }

    public void info(String message) {

        System.out.println(GREEN + message + GREEN);
    }

    public void error(String message) {

        System.out.println(RED + message + RED);
    }
}
