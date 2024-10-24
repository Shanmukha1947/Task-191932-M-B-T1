package com.example;

public class SubtractionPlugin implements MathOperationPlugin {
    @Override
    public double operate(double x, double y) {
        return x - y;
    }
}
