package chain_of_responsibility;

import static chain_of_responsibility.LogLevel.DEBUG;

public class DebugLogger extends AbstractLogger {
    DebugLogger() {
        this.level = DEBUG;
    }

    @Override
    public void doWrite(String msg) {
        System.out.println("DEBUG log:" + msg);
    }
}
