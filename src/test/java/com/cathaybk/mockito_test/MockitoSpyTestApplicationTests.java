package com.cathaybk.mockito_test;

import com.cathaybk.mockito_test.spydemo.AddAndSubstractService;
import com.cathaybk.mockito_test.spydemo.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.anyInt;

@SpringBootTest
class MockitoSpyTestApplicationTests {

    @Spy
    private AddAndSubstractService addAndSubstractService;

    @InjectMocks
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("🏁test_001🏁")
    void test_001(TestInfo testInfo) {
        System.err.println("============== " + testInfo.getDisplayName() + " ==============");
        Mockito.doReturn(777).when(addAndSubstractService).add(anyInt(), anyInt());
        Mockito.when(addAndSubstractService.add(anyInt(), anyInt())).thenReturn(888);
        int ans = calculatorService.doAdd(111, 222);
        System.out.println(ans);
        Assertions.assertEquals(888, ans);
    }

}
