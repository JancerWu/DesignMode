package Factory;


import Factory.Card.CardFactory;
import Factory.Framework.Factory;
import Factory.Framework.Product;

public class Test {
    public static void main(String[] args) {
        Factory cardFactory = new CardFactory();
        Product cardA = cardFactory.create("Alice");
        Product cardB = cardFactory.create("Bob");
        cardA.use();
        cardB.use();
    }
}
