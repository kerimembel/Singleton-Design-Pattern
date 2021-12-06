import singleton.LoggerSingleton;

public class Main {

    public static void main(String[] args){

        LoggerSingleton LOGGER1 = LoggerSingleton.getLogger();
        LoggerSingleton LOGGER2 = LoggerSingleton.getLogger();

        System.out.println("LOGGER1 -> " + LOGGER1);
        System.out.println("LOGGER2 -> " + LOGGER2);

        if(LOGGER1==LOGGER2){
            LOGGER1.info("Singleton works!");
        } else {
            LOGGER2.error("Singleton doesn't works :/");
        }
    }
}
