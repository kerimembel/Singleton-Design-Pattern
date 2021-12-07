import singleton.SingletonLogger;

public class Main {

    public static void main(String[] args){

        SingletonLogger LOGGER1 = SingletonLogger.getLogger();
        SingletonLogger LOGGER2 = SingletonLogger.getLogger();

        System.out.println("LOGGER1 -> " + LOGGER1);
        System.out.println("LOGGER2 -> " + LOGGER2);

        if(LOGGER1==LOGGER2){
            LOGGER1.info("Singleton works!");
        } else {
            LOGGER2.error("Singleton doesn't works :/");
        }
    }
}
