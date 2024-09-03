package main.java.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> bookList;

    public BookCatalog () {
        this.bookList = new ArrayList<> ();
    }

    public void addBook (String title, String author, int publicationYear) {
        bookList.add (new Book (title, author, publicationYear));
    }

    public List<Book> searchByAuthor (String author) {
        List<Book> booksByAuthor = new ArrayList<> ();
        if (!bookList.isEmpty ()) {
            for (Book b : bookList) {
                if (b.getAuthor ().equalsIgnoreCase (author)) {
                    booksByAuthor.add(b);
                }
            }
        }

        return booksByAuthor;
    }

    public List<Book> searchByYearRange(int startYear, int endYear) {
        List<Book> booksByYearRange = new ArrayList<> ();
        if (!bookList.isEmpty ()) {
            for (Book b : bookList) {
                if (b.getPublicationYear () >= startYear && b.getPublicationYear () <= endYear) {
                    booksByYearRange.add(b);
                }
            }
        }

        return booksByYearRange;
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;
        if (!bookList.isEmpty ()) {
            for (Book b : bookList) {
                if (b.getTitle ().equalsIgnoreCase (title)) {
                    bookByTitle = b;
                    break;
                }
            }
        }

        return bookByTitle;
    }

    public static void main (String[] args) {
        BookCatalog bookCatalog = new BookCatalog ();

        bookCatalog.addBook ("Livro 1", "Autor 1" , 2011);
        bookCatalog.addBook ("Livro 2", "Autor 2" , 2013);
        bookCatalog.addBook ("Livro 1", "Autor 2" , 2012);
        bookCatalog.addBook ("Livro 3", "Autor 3" , 2016);
        bookCatalog.addBook ("Livro 4", "Autor 4" , 2020);

        System.out.println (bookCatalog.searchByAuthor ("Autor 4"));
        System.out.println (bookCatalog.searchByYearRange (2011, 2013));
        System.out.println (bookCatalog.searchByTitle ("Livro 3"));
    }
}
