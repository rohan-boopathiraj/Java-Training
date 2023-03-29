package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {

    private static final Map<String, BookType>  bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String firstName, String lastName) {
        if (bookTypes.get(type) == null) {
            bookTypes.put(type, new BookType(type, firstName, lastName));
        }
        return bookTypes.get(type);
    }

}
