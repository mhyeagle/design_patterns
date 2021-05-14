package chain_of_responsibility;

import org.jetbrains.annotations.NotNull;

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

    public int getLevel() {
        return this.level;
    }

    public int compare(@NotNull LogLevel log) {
        return this.level - log.level;
    }
}
