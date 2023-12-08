package hus.oop.design_patterns.IteratorPattern;

public class ProductCatalog implements Iterable {
    public String[] productCatalog;

    public ProductCatalog(String[] productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }
}
