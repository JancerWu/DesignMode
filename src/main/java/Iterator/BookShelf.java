package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    private List<Book> bookList;
    BookShelf() {
        bookList = new ArrayList<Book>();
    }
    public Iterator iterator() {
        return new BookIterator(this);
    }
    public int getBookShelfSize() {
        return bookList.size();
    }
    public Book getBook(int index) {
        return bookList.get(index);
    }
    public void addBook(Book book) {
        bookList.add(book);
    }
}
