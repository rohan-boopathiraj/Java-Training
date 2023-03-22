package StrategyPattern;

import java.util.Scanner;

public class StrategyApp {

	public static void main(String[] args) throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Laptop Brand Name : ");
		String brandName = s.next();
		
		Laptop laptop = (Laptop)Class.forName(brandName).newInstance();
		Showroom sr = new Showroom(laptop);

	}
}

class Showroom{
	Showroom(Laptop lp){
		lp.display();
		lp.color();
	}
}

 abstract class Laptop{
	 abstract void display();
	 abstract void color();
 }
 
 class Lenovo extends Laptop{
	 Lenovo(){
		 System.out.println("Lenovo laptop");
	 }
	 
	 void display() {
		 System.out.println("Lenovo has LED Display");
	 }
	 
	 void color() {
		 System.out.println("Lenovo laptop color is Black");
	 }
 }
 
class Apple extends Laptop{
	 
	 void display() {
		 System.out.println("Apple has HDR Display");
	 }
	 
	 void color() {
		 System.out.println("Apple laptop color is Grey");
	 }
 }

class Dell extends Laptop{
	 
	 void display() {
		 System.out.println("Dell has AMOLED Display");
	 }
	 
	 void color() {
		 System.out.println("Dell laptop color is White");
	 }
}