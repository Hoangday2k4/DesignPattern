package hus.oop.design_patterns.builderPattern.exercises;

public class ConstructionEngineerTest {
    public static void main(String[] args) {
        testConstructHouse();
    }

    public static void testConstructHouse() {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House A is: " + houseA);

        HouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House B is: " + houseB);
    }
}