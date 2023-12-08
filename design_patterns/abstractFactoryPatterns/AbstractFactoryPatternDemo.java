package hus.oop.design_patterns.abstractFactoryPatterns;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer1 = new FactoryProducer(
                new ShapeFactory(
                        new Rectangle()));

        FactoryProducer factoryProducer2 = new FactoryProducer(
                new RoundedShapeFactory(
                        new RoundedSquare()));

        factoryProducer1.getFactory().getShape().draw();
        factoryProducer2.getFactory().getShape().draw();
    }
}
