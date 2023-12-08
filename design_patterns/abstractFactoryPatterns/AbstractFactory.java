package hus.oop.design_patterns.abstractFactoryPatterns;

public abstract class AbstractFactory {
    Shape shape;

    public AbstractFactory(Shape shape) {
        this.shape = shape;
    }

    public abstract Shape getShape();
}
