package Assingment2;


class CustomException extends Exception{
	CustomException(String expMsg){
		super(expMsg);
	}
}

public class Excercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		try {
			if(num < 0) 
			{
				throw new CustomException("Invalid input, give a positive number");
			}
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
