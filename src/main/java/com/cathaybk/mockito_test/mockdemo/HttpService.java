package com.cathaybk.mockito_test.mockdemo;

import java.util.Random;

/**
 * @author RogerLo
 * @date 2022/9/15
 */
public class HttpService {

    // 模擬發起 request
    public int queryStatus() {
        return new Random().nextInt(2);
    }

}
