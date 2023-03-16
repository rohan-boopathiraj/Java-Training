package Assingment2;

public class Excercise2 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("catch-mth2");
		}finally {
			System.out.println("finally mth2");
		}
		
	}
	public static void main(String[] args) {
		Excercise2 ex = new Excercise2();
		ex.mth1();
	}
	
}
