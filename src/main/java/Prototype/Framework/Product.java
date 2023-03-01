package Prototype.Framework;

public abstract class Product implements Cloneable {
    public void use(String s) {

    }

    public Product createClone() {
        Product product = null;
        try {
        product = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
        e.printStackTrace();
        }
        return product;
    }
}
