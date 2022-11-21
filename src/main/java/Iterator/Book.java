package Iterator;

public class Book {
    private String name;
    private String id;
    Book(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("name:%s, id:%s", name, id);
    }
}
