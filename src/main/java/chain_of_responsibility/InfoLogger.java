package chain_of_responsibility;

public class InfoLogger extends AbstractLogger {
    InfoLogger() {
        this.level = INFO;
    }

    @Override
    public void write(String msg) {
        System.out.println("INFO log: " + msg);
    }
}
