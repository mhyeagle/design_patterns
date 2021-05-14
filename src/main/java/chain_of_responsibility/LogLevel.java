package chain_of_responsibility;

public enum LogLevel {
    DEBUG(1, "debug log"),
    INFO(2, "info log"),
    ERROR(3, "error log");

    private final int level;
    private final String illustrate;

    LogLevel(int level, String illustrate) {
        this.level = level;
        this.illustrate = illustrate;
    }

    public LogLevel valueOf(int level) {
        switch (level) {
            case 1:
                return DEBUG;
            case 2:
                return INFO;
            default:
                throw new IllegalArgumentException("paramenter of log level error");
        }
    }


}
