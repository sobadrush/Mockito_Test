package com.cathaybk.mockito_test.spydemo;

/**
 * @author RogerLo
 * @date 2022/9/15
 */
public class CalculatorService {

    private AddAndSubstractService addAndSubstractService;

    public int doAdd(int n1, int n2) {
        return this.addAndSubstractService.add(n1, n2);
    }

}
