package Iterator;

public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("Alice", "1"));
        bookShelf.addBook(new Book("Bod", "2"));
        bookShelf.addBook(new Book("Cathy", "3"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }





    }
}
