package Iterator;

public class BookIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    BookIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getBookShelfSize();
    }

    @Override
    public Book next() {
        Book curBook = bookShelf.getBook(index);
        index++;
        return curBook;
    }
}
