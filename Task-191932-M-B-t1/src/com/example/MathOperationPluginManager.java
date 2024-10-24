package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class MathOperationPluginManager {
    private final List<MathOperationPlugin> plugins;

    public MathOperationPluginManager() {
        plugins = new ArrayList<>();
        // Load plugins using ServiceLoader
        ServiceLoader<MathOperationPlugin> loader = ServiceLoader.load(MathOperationPlugin.class);
        for (MathOperationPlugin plugin : loader) {
            plugins.add(plugin);
        }
    }

    public List<MathOperationPlugin> getPlugins() {
        return plugins;
    }

    public double performOperation(String operation, double x, double y) {
        for (MathOperationPlugin plugin : plugins) {
            if (plugin.getClass().getSimpleName().equals(operation)) {
                return plugin.operate(x, y);
            }
        }
        throw new IllegalArgumentException("Invalid operation: " + operation);
    }
}
