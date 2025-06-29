package org.example;

public class MyService {
    private Logger logger;

    public MyService(Logger logger) {
        this.logger = logger;
    }

    public void doWork() {
        logger.log("Starting work...");
    }
}
