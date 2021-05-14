package chain_of_responsibility;

import static chain_of_responsibility.LogLevel.ERROR;

public class ErrorLogger extends AbstractLogger {
    ErrorLogger() {
        this.level = ERROR;
    }

    @Override
    public void doWrite(String msg) {
        System.out.println("ERROR log:" + msg);
    }
}
