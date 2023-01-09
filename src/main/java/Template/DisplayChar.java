package Template;

public class DisplayChar extends RepeatPrint {
    private char c;
    DisplayChar(int times, char c) {
        super(times);
        this.c = c;
    }

    @Override
    void open() {
        System.out.print("<<");
    }

    @Override
    void print() {
        System.out.print(c);
    }

    @Override
    void close() {
        System.out.println(">>");
    }
}
