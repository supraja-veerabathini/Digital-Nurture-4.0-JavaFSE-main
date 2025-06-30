package org.example;

public class PerformanceTester {
    public void performTask() {
        try {
            // Simulate a task that takes time (e.g., 300 milliseconds)
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
