package Composite;

public class Test {
    public static void main(String[] args) {
        Component root = new Directory("root");
        Component file1 =  new File("file1", 50);
        root.add(file1);
        Component dirs1 = new Directory("dir1");
        Component file2 = new File("file2", 100);
        Component file3 = new File("file3", 1000);
        dirs1.add(file2);
        dirs1.add(file3);
        root.add(dirs1);
        root.display();
        root.remove(file1);
        root.display();
    }
}
