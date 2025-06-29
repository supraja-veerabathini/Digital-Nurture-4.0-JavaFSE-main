package org.example;

public class MyService {
    private Logger logger;

    public MyService(Logger logger) {
        this.logger = logger;
    }

    public void doWork() {
        // perform some logic
        logger.log("Work done!");
    }
}
