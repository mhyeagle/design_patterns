package chain_of_responsibility;

public class ChainLogger {
    private AbstractLogger head, tail;

    public void addLogger(AbstractLogger logger) {
        if (logger == null) {
            throw new RuntimeException("The logger added to chain is null");
        }

        if (head == null && tail == null) {
            head = logger;
            tail = logger;
            return;
        }

        tail.setNextLogger(logger);
        tail = logger;
    }

    public void logMessage() {

    }
}
