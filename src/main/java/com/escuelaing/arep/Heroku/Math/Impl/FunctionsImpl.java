package com.escuelaing.arep.Heroku.Math.Impl;

import com.escuelaing.arep.Heroku.Math.Functions;

import org.springframework.stereotype.Service;

@Service
public class FunctionsImpl implements Functions {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int substrac(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    @Override
    public int exponent(int a, int b) {
        int res = -1;
        for (int i = 0; i < b; i++) {
            res += a;
        }
        return res;
    }

    @Override
    public int square(int a) {
        return a * a;
    }
}