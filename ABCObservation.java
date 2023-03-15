package Assignment1;


public class ABCObservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C objC = new C();
	}

}

class A{
	
	A() {
		System.out.println("A class constructor");
	}
}

class B{
	
	B() {
		System.out.println("B class constructor");
	}
}

class C extends A{
	B objB = new B();
}


