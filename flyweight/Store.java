package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String firstName, String lastName) {
        BookType bookType = BookFactory.getBookType(type, firstName, lastName);
        books.add(new Book(name, price, bookType));
    }

    public void displayBooks() {
       for(Book book: books) {
    	   System.out.println(book);
       }
    }

}
