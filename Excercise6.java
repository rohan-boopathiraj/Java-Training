package Assingment2;


  class Base{
	public Base() throws Exception{
		throw new Exception("Base class Exception");
	}
}

class Derived extends Base {
	public Derived() {
		try {
			super();
		}
		catch(Exception e){
			System.out.println("Error Handled");
			System.out.println(e.getMessage());

		}
	}
}

public class Excercise6 {
	public static void main(String[] args) {
		Derived d = new Derived();
	}
}
