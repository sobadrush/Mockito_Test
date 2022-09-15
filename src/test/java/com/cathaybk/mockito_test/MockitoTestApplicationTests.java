package com.cathaybk.mockito_test;

import com.cathaybk.mockito_test.mockdemo.ExampleService;
import com.cathaybk.mockito_test.mockdemo.HttpService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MockitoTestApplicationTests {

    @Mock
    private HttpService httpService;

    @InjectMocks
    private ExampleService exampleService = new ExampleService();

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("🏁test_001🏁")
    void test_001(TestInfo testInfo) {
        System.err.println("============== " + testInfo.getDisplayName() + " ==============");
        Mockito.when(httpService.queryStatus()).thenReturn(1);
        System.out.println(this.exampleService.sayHello());
    }

}
