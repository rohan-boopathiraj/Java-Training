package Assingment2;


class CustomException extends Exception{
	CustomException(String expMsg){
		super(expMsg);
	}
}

public class Excercise4 {
	
	static void postiveNum(int num) throws CustomException {
		throw new CustomException("Invalid input, give a positive number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			postiveNum(-12);
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
