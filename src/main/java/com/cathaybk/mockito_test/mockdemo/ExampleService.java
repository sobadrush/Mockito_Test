package com.cathaybk.mockito_test.mockdemo;

/**
 * @author RogerLo
 * @date 2022/9/15
 */
public class ExampleService {

    private HttpService httpService;

    public String sayHello() {
        int status = httpService.queryStatus();
        System.out.println("status = " + status);
        switch (status) {
            case 0:
                return "你好";
            case 1:
                return "Hello";
            default:
                return "未知狀態";
        }
    }

}
