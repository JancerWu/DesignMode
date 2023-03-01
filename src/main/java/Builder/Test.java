package Builder;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();
        director.construct(builderA);
        director.construct(builderB);
        builderA.getProduct().show();
        builderB.getProduct().show();
    }
}
