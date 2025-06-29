package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        // Step 1: Create mock
        Logger mockLogger = mock(Logger.class);

        // Step 2: Stub void method to throw exception
        doThrow(new RuntimeException("Log failed")).when(mockLogger).log(anyString());

        // Step 3: Create service and call method
        MyService service = new MyService(mockLogger);

        // Step 4: Assert exception is thrown
        assertThrows(RuntimeException.class, service::doWork);

        // Step 5: Verify method was called
        verify(mockLogger).log("Starting work...");
    }
}

