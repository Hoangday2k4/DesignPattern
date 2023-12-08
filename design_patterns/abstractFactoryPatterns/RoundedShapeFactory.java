package hus.oop.design_patterns.abstractFactoryPatterns;

public class RoundedShapeFactory extends AbstractFactory {
    public RoundedShapeFactory(Shape shape) {
        super(shape);
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }
}
