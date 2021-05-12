package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        ChainLogger chainLogger = ChainLogger.getLogger();

        chainLogger.logMessage(AbstractLogger.DEBUG, "debug message");
//        chainLogger.logMessage(AbstractLogger.INFO, "info message");
//        chainLogger.logMessage(AbstractLogger.ERROR, "error message");
    }
}
