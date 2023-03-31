package Assignment1;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MakeObject obj1 = MakeObject.getObject();
		MakeObject obj2 = MakeObject.getObject();
		
	}

}

class MakeObject{
	
	static MakeObject obj = new MakeObject();
	
	private MakeObject() {
		
	}
	
	public static MakeObject getObject() {
		return obj;
	}
}