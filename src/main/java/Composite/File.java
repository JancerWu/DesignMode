package Composite;

public class File extends Component {

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    protected void display(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
