package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultipleAppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(MultipleAppenderExample.class);

    public static void main(String[] args) {
        logger.debug("Debug message - for developers");
        logger.info("Info message - general information");
        logger.warn("Warning message - something is off");
        logger.error("Error message - something went wrong");
    }
}

