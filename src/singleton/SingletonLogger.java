package singleton;

import static singleton.Constants.*;

public class SingletonLogger {

    private static SingletonLogger logger;

    private SingletonLogger() {}

    public static SingletonLogger getLogger() {
        if(logger == null) {
            logger = new SingletonLogger();
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
