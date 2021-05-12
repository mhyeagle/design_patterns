package chain_of_responsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChainLogger {
    private static ChainLogger instance;

    private DebugLogger debugLogger;
    private InfoLogger infoLogger;
    private ErrorLogger errorLogger;

    public static ChainLogger getLogger() {
        if (instance == null) {
            ChainLogger logger = new ChainLogger();
            setInstance(logger);
        }

        return instance;
    }

    public static void logMessage(int level, String msg) {
        instance.getDebugLogger().logMessage(level, msg);
    }

    private ChainLogger() {
        this.debugLogger = new DebugLogger();
        this.infoLogger = new InfoLogger();
        this.errorLogger = new ErrorLogger();

        this.debugLogger.setNextLogger(this.infoLogger);
        this.infoLogger.setNextLogger(this.errorLogger);
    }

    private synchronized static void setInstance(ChainLogger chainLogger) {
        if (instance == null) {
            instance = chainLogger;
        }
    }
}
