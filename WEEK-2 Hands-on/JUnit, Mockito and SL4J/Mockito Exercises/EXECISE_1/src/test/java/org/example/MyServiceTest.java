package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange: Create a mock of ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the method getData() to return "Mock Data"
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Act: Call fetchData()
        String result = service.fetchData();

        // Assert: Check if it returns the mocked data
        assertEquals("Mock Data", result);
    }
}
