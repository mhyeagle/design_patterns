package chain_of_responsibility;

abstract class AbstractLogger implements Logger {
    public static final int DEBUG = 1;
    public static final int INFO =2;
    public static final int ERROR = 3;

    protected int level;

    // next logger in the chain
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger logger) {
        nextLogger = logger;
    }

    public void logMessage(int level, String msg) {
        if (this.level < level) {
            write(msg);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, msg);
        }
    }
}
