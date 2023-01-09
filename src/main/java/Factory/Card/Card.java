package Factory.Card;

import Factory.Framework.Product;

public class Card extends Product {
    private String owner;

    Card(String owner) {
        this.owner = owner;
        System.out.printf("produce %s's card\n", owner);
    }

    @Override
    public void use() {
        System.out.printf("use %s's card\n", owner);
    }

    public String getOwner() {
        return owner;
    }
}
