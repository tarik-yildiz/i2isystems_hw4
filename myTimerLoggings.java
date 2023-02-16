package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class myTimerLoggings {
    private static final Logger debugLogger = LogManager.getLogger("debugLogger");
    private static final Logger infoLogger = LogManager.getLogger("infoLogger");
    private static final Logger errorLogger = LogManager.getLogger("errorLogger");

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            String debugMessage = String.format("Debug - Current time: %tT", System.currentTimeMillis());
            debugLogger.debug(debugMessage);
            String infoMessage = String.format("Info - Current minute: %tM", System.currentTimeMillis());
            infoLogger.info(infoMessage);
            String errorMessage = String.format("Error - Current hour: %tH", System.currentTimeMillis());
            errorLogger.error(errorMessage);

            Thread.sleep(1000);
        }
    }
}
