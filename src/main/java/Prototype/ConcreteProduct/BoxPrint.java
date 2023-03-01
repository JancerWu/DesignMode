package Prototype.ConcreteProduct;

import Prototype.Framework.Product;

public class BoxPrint extends Product {

    private char element;

    public BoxPrint(char c) {
        element = c;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        for (int i = 0; i < len + 4; i++) {
            System.out.print(element);
        }
        System.out.println();
        System.out.print(element + " "+s + " " + element);
        System.out.println();
        for (int i = 0; i < len + 4; i++) {
            System.out.print(element);
        }
        System.out.println();
    }

}
