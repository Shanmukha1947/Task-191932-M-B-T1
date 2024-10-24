package com.example;

public class AdditionPlugin implements MathOperationPlugin {
    @Override
    public double operate(double x, double y) {
        return x + y;
    }
}
