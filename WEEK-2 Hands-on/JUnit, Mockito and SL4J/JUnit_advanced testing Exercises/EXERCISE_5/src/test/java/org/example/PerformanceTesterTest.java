package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskCompletesInTime() {
        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofMillis(500), () -> {
            tester.performTask();  // should complete in under 500ms
        });
    }
}
