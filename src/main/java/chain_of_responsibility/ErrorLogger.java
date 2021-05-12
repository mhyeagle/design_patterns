package chain_of_responsibility;

public class ErrorLogger extends AbstractLogger {
    ErrorLogger() {
        this.level = ERROR;
    }

    @Override
    public void write(String msg) {
        System.out.println("ERROR log:" + msg);
    }
}
