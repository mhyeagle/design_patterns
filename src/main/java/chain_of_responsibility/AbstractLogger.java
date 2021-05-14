package chain_of_responsibility;

abstract class AbstractLogger implements Logger {
    LogLevel level;

    // next logger in the chain
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger logger) {
        nextLogger = logger;
    }

    public void logMessage(LogLevel logLevel, String msg) {
        // common operation
        if (this.level.getLevel() <= logLevel.getLevel()) {
            // need to implement in child class
            doWrite(msg);
        }

        // common operation
        if (nextLogger != null) {
            nextLogger.logMessage(logLevel, msg);
        }
    }
}
