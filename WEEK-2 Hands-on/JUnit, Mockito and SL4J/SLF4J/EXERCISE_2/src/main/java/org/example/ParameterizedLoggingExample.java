package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "supraja";
        LocalDateTime loginTime = LocalDateTime.now();
        int itemsInCart = 3;

        // Parameterized logging
        logger.info("User {} logged in at {}", username, loginTime);
        logger.warn("User {} has {} items in their cart", username, itemsInCart);
        logger.error("User {} encountered an error at {}", username, loginTime);
    }
}
