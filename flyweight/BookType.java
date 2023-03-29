package flyweight;

public class BookType {

    private final String type;
    private final String firstName;
    private final String lastName;
	
    BookType(String type, String firstName, String lastName){
    	this.type = type;
    	this.firstName = firstName;
    	this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "BookType [type=" + type + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
