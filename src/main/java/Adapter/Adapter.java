package Adapter;

public class Adapter extends Adapted implements Target{
    Adapter(String text) {
        super(text);
    }
    @Override
    public void targetMethod1() {
        System.out.println("wrap before");
        AdaptedMethod1();
        System.out.println("wrap after");
    }

    @Override
    public void targetMethod2() {
        System.out.println("wrap before");
        AdaptedMethod2();
        System.out.println("wrap after");
    }
}
