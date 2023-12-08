package hus.oop.design_patterns.factoryMethodPattern;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit apple = factory.provideFruit("Apple");
        Fruit banana = factory.provideFruit("Banana");
        Fruit orange = factory.provideFruit("Orange");

        apple.produceJuice();
        banana.produceJuice();
        orange.produceJuice();
    }
}
