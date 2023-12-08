package hus.oop.design_patterns.builderPattern.exercises;

import hus.oop.design_patterns.builderPattern.exercises.House;
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}