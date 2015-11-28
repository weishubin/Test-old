package com.weishubin.test.mock;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.*;

/**
 * Created by weishubin on 15/11/21.
 */
public class MockTest {

    @Test
    public void testMock() {
        Service mockList = mock(Service.class);

        when(mockList.insert(anyString())).thenReturn(false);
        org.junit.Assert.assertFalse(mockList.insert("abc"));

        when(mockList.insert(anyString())).thenReturn(true);
        org.junit.Assert.assertTrue(mockList.insert("abc"));
    }
}
