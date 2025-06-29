package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub multiple returns
        when(mockApi.getData()).thenReturn("First").thenReturn("Second");

        MyService service = new MyService(mockApi);

        String result = service.fetchTwice();

        System.out.println(result); // Should print: First & Second
        verify(mockApi, times(2)).getData(); // Ensure getData called twice
    }
}

