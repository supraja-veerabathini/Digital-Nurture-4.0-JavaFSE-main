package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class TestService {
    @Test
    public void testOrder() {
        Service mockService = mock(Service.class);

        mockService.step1();
        mockService.step2();

        // Step 3: Verify order
        InOrder inOrder = inOrder(mockService);
        inOrder.verify(mockService).step1();
        inOrder.verify(mockService).step2();
    }
}
