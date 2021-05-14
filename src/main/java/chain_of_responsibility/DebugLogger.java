package chain_of_responsibility;

public class DebugLogger extends AbstractLogger {
    DebugLogger() {
        this.level = DEBUG;
    }

    @Override
    public void doWrite(String msg) {
        System.out.println("DEBUG log:" + msg);
    }
}
