package hus.oop.design_patterns.abstractFactoryPatterns;

public class FactoryProducer {
    AbstractFactory factory;

    public FactoryProducer(AbstractFactory factory) {
        this.factory = factory;
    }

    public AbstractFactory getFactory() {
        return this.factory;
    }
}
