package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodLogging() {
        // Step 1: Create mock
        Logger mockLogger = mock(Logger.class);

        // Step 2: Stub the void method (optional, here it's just doNothing)
        doNothing().when(mockLogger).log(anyString());

        // Step 3: Call the service
        MyService service = new MyService(mockLogger);
        service.doWork();

        // Step 4: Verify the void method was called with expected argument
        verify(mockLogger).log("Work done!");
    }
}

