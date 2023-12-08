package hus.oop.design_patterns.abstractFactoryPatterns;

public class ShapeFactory extends AbstractFactory {
    public ShapeFactory(Shape shape) {
        super(shape);
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }
}
