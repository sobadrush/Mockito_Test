package com.cathaybk.mockito_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={ DataSourceAutoConfiguration.class})
public class MockitoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockitoTestApplication.class, args);
    }

}
