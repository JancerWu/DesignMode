package Builder;

public class ConcreteBuilderB extends Builder{
    Product product = new Product();
    @Override
    public void BuildPartA() {
        product.addParts("部件C");
    }

    @Override
    public void BuildPartB() {
        product.addParts("部件D");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
