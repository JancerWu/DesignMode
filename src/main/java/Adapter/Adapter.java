package Adapter;

public class Adapter extends Adapted implements Target{
    @Override
    public void targetMethod(String info) {
        System.out.println("wrap before");
        this.AdaptedMethod(info);
        System.out.println("wrap after");
    }
}
