package Assingment2;




public class Excercise5 {

	static void postiveNum(int num) throws CustomException {
		throw new CustomException("Invalid input, give a positive number");
	}
	
	static void catchExp() {
		try {
			postiveNum(-12);
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		catchExp();
	}
	
}
