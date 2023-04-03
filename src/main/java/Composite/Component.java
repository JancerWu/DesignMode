package Composite;

public abstract class Component {
    public String name;

    public int size;

    public abstract int getSize();

    public void add(Component c) {
        System.out.println("只有文件夹能插入文件！");
    }

    public void remove(Component c) {
        System.out.println("只有文件夹才能删除文件！");
    }

    public void display() {
        display("");
    }

    protected abstract void display(String prefix);

    @Override
    public String toString() {
        return "/" + name + "(" + getSize() + ")";
    }
}
