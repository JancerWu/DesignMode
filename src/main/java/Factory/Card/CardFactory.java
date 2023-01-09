package Factory.Card;

import Factory.Framework.Factory;
import Factory.Framework.Product;

import java.util.ArrayList;
import java.util.List;

public class CardFactory extends Factory {
    List<String> owners = new ArrayList<>();

    @Override
    public Product createMethod(String owner) {
        return new Card(owner);
    }

    @Override
    public void register(Product product) {
        owners.add(((Card)product).getOwner());
    }
}
