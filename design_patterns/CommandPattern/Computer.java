package hus.oop.design_patterns.CommandPattern;

public class Computer {
    public Computer() {
    }

    public void shutDown() {
        System.out.println("ShutDown!");
    }

    public void restart() {
        System.out.println("Start!");
    }
}
