package chain_of_responsibility;

public class SingleChainLogger {
    private static SingleChainLogger instance;

    private DebugLogger debugLogger;
    private InfoLogger infoLogger;
    private ErrorLogger errorLogger;

    public static SingleChainLogger getLogger() {
        if (instance == null) {
            SingleChainLogger logger = new SingleChainLogger();
            setInstance(logger);
        }

        return instance;
    }

    public void logMessage(LogLevel level, String msg) {
        instance.getDebugLogger().logMessage(level, msg);
    }

    private SingleChainLogger() {
        this.debugLogger = new DebugLogger();
        this.infoLogger = new InfoLogger();
        this.errorLogger = new ErrorLogger();

        this.debugLogger.setNextLogger(this.infoLogger);
        this.infoLogger.setNextLogger(this.errorLogger);
    }

    private synchronized static void setInstance(SingleChainLogger singleChainLogger) {
        if (instance == null) {
            instance = singleChainLogger;
        }
    }

    private DebugLogger getDebugLogger() {
        return this.debugLogger;
    }
}
