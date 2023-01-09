package Template;

public abstract class RepeatPrint {
    private final int times;
    RepeatPrint(int times) {
        this.times = times;
    }
    abstract void open();
    abstract void print();
    abstract void close();
    public final void display() {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
