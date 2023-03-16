package Assingment2;

class Base{
	Base() throws Exception{
		throw new Exception();
	}
}

class Derived extends Base {
	Derived() throws Exception{
		try {
			
		}
		catch(Exception e){
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}
}

public class Excercise6 {
	public static void main(String[] args) throws Exception  {
		new Derived();
	}
}
