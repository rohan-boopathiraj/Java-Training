package Assingment2;




public class Excercise5 {

	static void positiveNum(int num) throws CustomException {
		if(num < 0)
		throw new CustomException("Invalid input, give a positive number");
	}
	
	static void catchExp() {
		try {
			positiveNum(-12);
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		catchExp();
	}
	
}
