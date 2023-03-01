package Prototype;

import Prototype.ConcreteProduct.BoxPrint;
import Prototype.ConcreteProduct.UnderlinePrint;
import Prototype.Framework.Manager;
import Prototype.Framework.Product;

public class Test {
    public static void main(String[] args) {
        Product p1 = new BoxPrint('*');
        Product p2 = new BoxPrint('+');
        Product p3 = new UnderlinePrint('#');
        Manager manger = new Manager();
        manger.register("p1", p1);
        manger.register("p2", p2);
        manger.register("p3", p3);
        Product c1 = manger.create("p1");
        c1.use("hello word");
        Product c2 = manger.create("p2");
        c2.use("hello word");
        Product c3 = manger.create("p3");
        c3.use("hello word");



    }
}
