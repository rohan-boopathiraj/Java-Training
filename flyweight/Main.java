package flyweight;



public class Main {

	private static final int BOOK_TYPES = 2;
	private static final int BOOKS_TO_INSERT = 10;

	public static void main(String[] args) {

		Store store = new Store();
		for (int i = 1; i < (BOOKS_TO_INSERT / BOOK_TYPES)+1; i++) {
			String bookName = "Book" + i;
			int price = i * 100;
			store.storeBook(bookName, price, "Non-Fiction", "James", "Clear");
			store.storeBook(bookName + "1", price, "Fiction", "Jordan", "Peterson");

		}
		store.displayBooks();
	}

}
