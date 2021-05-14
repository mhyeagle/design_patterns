package chain_of_responsibility;

import static chain_of_responsibility.LogLevel.INFO;

public class InfoLogger extends AbstractLogger {
    InfoLogger() {
        this.level = INFO;
    }

    @Override
    public void doWrite(String msg) {
        System.out.println("INFO log: " + msg);
    }
}
