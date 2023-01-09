package Template;

import java.nio.charset.StandardCharsets;

public class DisplayString extends RepeatPrint{

    private int width;
    private String str;
    DisplayString(int times, String str) {
        super(times);
        this.str = str;
        this.width = str.getBytes().length;
    }

    @Override
    void open() {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    void close() {
        open();
    }
}
