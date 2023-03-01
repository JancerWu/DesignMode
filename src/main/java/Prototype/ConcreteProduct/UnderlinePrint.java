package Prototype.ConcreteProduct;

import Prototype.Framework.Product;

public class UnderlinePrint extends Product {
    private char element;

    public UnderlinePrint(char c) {
        element = c;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        System.out.println(s);
        for (int i = 0; i < len; i++) {
            System.out.print(element);
        }
        System.out.println();
    }
}
