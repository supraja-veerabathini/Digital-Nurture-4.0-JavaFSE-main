package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Create service and call method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called
        verify(mockApi).getData();
    }
}
