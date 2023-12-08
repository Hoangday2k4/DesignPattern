package hus.oop.design_patterns.IteratorPattern;

public class ProductIterator implements Iterator {
    ProductCatalog catalog;
    int position;

    public ProductIterator() {
        this.position = 0;
    }

    @Override
    public boolean hasnext() {
        if (position < catalog.productCatalog.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasnext()) {
            return catalog.productCatalog[position++];
        }
        return null;
    }
}
