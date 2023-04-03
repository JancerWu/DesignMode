package Composite;

import java.util.HashSet;
import java.util.Set;

public class Directory extends Component{

    private Set<Component>  children = new HashSet<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Component c : children) {
            size += c.getSize();
        }
        return size;
    }

    @Override
    protected void display(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Component c : children) {
            c.display(prefix + "/" + this);
        }
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }
}
