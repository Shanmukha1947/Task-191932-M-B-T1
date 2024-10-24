package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MathOperationPluginManager manager = new MathOperationPluginManager();
        List<MathOperationPlugin> plugins = manager.getPlugins();

        System.out.println("Available Plugins:");
        for (MathOperationPlugin plugin : plugins) {
            System.out.println(" - " + plugin.getClass().getSimpleName());
        }

        // Perform operations using the plugins
        double x = 10.0;
        double y = 20.0;
        System.out.println("\nResults:");
        try {
            System.out.println("Addition: " + manager.performOperation("AdditionPlugin", x, y));
            System.out.println("Subtraction: " + manager.performOperation("SubtractionPlugin", x, y));
            System.out.println("Multiplication: " + manager.performOperation("MultiplicationPlugin", x, y));
            System.out.println("Division: " + manager.performOperation("DivisionPlugin", x, y));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}