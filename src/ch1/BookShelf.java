package ch1;

import java.util.Iterator;
import java.util.ArrayList;

public class BookShelf implements java.lang.Iterable<Book> {
    private ArrayList<Book> books;

    public BookShelf(int max_size) {
        this.books = new ArrayList<Book>(max_size);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
