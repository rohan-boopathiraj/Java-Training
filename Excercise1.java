package Assingment2;

import java.io.IOException;

public class Excercise1 {	
	static void throwExp() {
		throw new Exception();
	}
	
	public static void main(String[] args) {
		throwExp();
		System.out.println("main handled");
	}
}
