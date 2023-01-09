package Adapter;

public class Test {
    public static void main(String[] args) {
        Target task = new Adapter("task");
        task.targetMethod1();
        task.targetMethod2();
    }
}
