package Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<>();
    public void addParts(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("该产品包含以下几个部分：");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
