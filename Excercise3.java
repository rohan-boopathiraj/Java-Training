package Assingment2;

public class Excercise3 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			System.exit(0);
		}catch(Exception e) {
			System.out.println("catch-mth2");
		}finally {
			System.out.println("finally mth2");
		}
		
	}
	public static void main(String[] args) {
		Excercise3 ex = new Excercise3();
		ex.mth1();
	}
	
}
