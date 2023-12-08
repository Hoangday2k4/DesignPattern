package hus.oop.design_patterns.factoryMethodPattern;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        Fruit fruit;
        switch (type) {
            case "Apple" :
                fruit = new Apple();
                break;
            case "Banana" :
                fruit = new Banana();
                break;
            case "Orange" :
                fruit = new Orange();
                break;
            default:
                throw new IllegalArgumentException("No such fruit.");
        }
        return fruit;
    }
}
