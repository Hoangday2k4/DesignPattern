package hus.oop.design_patterns.IteratorPattern;

public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] data = {"Hoang", "yeu", "VanAnh"};
        ProductCatalog catalog = new ProductCatalog(data);
        ProductIterator productIterator = (ProductIterator) catalog.getIterator();

        for (Object temp : catalog.productCatalog) {
            System.out.print(temp + " ");
        }
    }
}
