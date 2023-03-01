package Builder;

public class ConcreteBuilderA extends Builder{
    Product product = new Product();

    @Override
    public void BuildPartA() {
        product.addParts("部件A");
    }

    @Override
    public void BuildPartB() {
        product.addParts("部件B");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
