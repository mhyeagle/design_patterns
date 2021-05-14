package chain_of_responsibility;

import static chain_of_responsibility.LogLevel.*;

public class Main {
    public static void main(String[] args) {
        SingleChainLogger singleChainLogger = SingleChainLogger.getLogger();

//        singleChainLogger.logMessage(DEBUG, "debug message");
//        singleChainLogger.logMessage(INFO, "info message");
        singleChainLogger.logMessage(ERROR, "error message");
    }
}
