package Factory.Framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product product = createMethod(owner);
        register(product);
        return product;
    }

    public abstract Product createMethod(String owner);

    public abstract void register(Product product);
}
