package flyweight;

public class Book {
	private final String name;
    private final double price;
    private final BookType type;
     
    Book(String name, double price, BookType type){
    	this.name = name;
    	this.price = price;
    	this.type = type;
    }

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
}	