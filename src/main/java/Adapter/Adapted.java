package Adapter;

public class Adapted {
    private String text;
    Adapted(String text) {
        this.text = text;
    }
    public void AdaptedMethod1() {
        System.out.println("(" + text + ")");
    }
    public void AdaptedMethod2() {
        System.out.println("*" + text + "*");
    }
}
