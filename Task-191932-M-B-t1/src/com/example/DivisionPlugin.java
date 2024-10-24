package com.example;

public class DivisionPlugin implements MathOperationPlugin {
    @Override
    public double operate(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }
}
