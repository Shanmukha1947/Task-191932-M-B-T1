package com.example;

public class MultiplicationPlugin implements MathOperationPlugin {
    @Override
    public double operate(double x, double y) {
        return x * y;
    }
}
