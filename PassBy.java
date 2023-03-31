package Assignment1;


public class PassBy {
	public static void main(String[] args) {
		Reference obj = new Reference();
		
		// Call by value, passing a interger
		System.out.println("Before pass by value "+obj.value);	
		new CallByMethods().passByValue(obj.value);
		
		System.out.println("After pass by value "+obj.value);
		
		// Passing Array
		System.out.println("Before passing the array");
		for(int i : obj.arr) {
			System.out.println(i);
		}
		System.out.println("Pass by referece Array");
		new CallByMethods().passByReferenceArray(obj);
		for(int i : obj.arr) {
			System.out.println(i);
		}
		
		// Passing objects
		System.out.println("Before passing the object "+ obj.value);
		System.out.println("Pass by referece object");
		new CallByMethods().passByReferenceObj(obj);
		System.out.println("After pass by refernce "+obj.value);
	}
}

class Reference{
	int value = 15;
	int arr[] = {1,0,0,0,0};
}

class CallByMethods{
	
	public void passByValue(int value) {
		value = 7;
	}
	
	public void passByReferenceObj(Reference obj) {
		obj.value = 7;
	}
	
	public void passByReferenceArray(Reference obj) {
		obj.arr[0] = 7;
	}
}
