package com.escuelaing.arep.Heroku.Services;

import com.escuelaing.arep.Heroku.Math.Functions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mathServices {

    @Autowired
    Functions math;

    public int sum(int a, int b) {
        return math.sum(a, b);
    }

    public int substrac(int a, int b) {
        return math.substrac(a, b);
    }

    public int multiply(int a, int b) {
        return math.multiply(a, b);
    }

    public int divide(int a, int b) {
        return math.divide(a, b);
    }

    public int exponent(int a, int b) {
        return math.exponent(a, b);
    }

    public int square(int a) {
        return math.square(a);
    }
}