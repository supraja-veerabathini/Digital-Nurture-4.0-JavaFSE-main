package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Call method with argument
        MyService service = new MyService(mockApi);
        service.send("Hello JUnit");

        // Step 3: Verify interaction using argument matcher
        verify(mockApi).sendData(eq("Hello JUnit")); // exact match
        verify(mockApi).sendData(any(String.class)); // allows any String
    }
}
