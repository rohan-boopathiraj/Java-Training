package Assignment1;

abstract class Shape{
	
}

interface CalArea{
	public double area();
}

interface CalVolume{
	public double volume();
}

class Circle implements CalArea{
	public double radius;
	final static double PI = 3.14;
	
	Circle(double radius){
		this.radius = radius;
	}
	public double area() {
		return PI * radius * radius ;
	}
}

class Square implements CalArea{
	double side;

	
	Square(double side){
		this.side = side;
	}
	public double area() {
		return side * side ;
	}
}

class Triangle implements CalArea{
	public double a,b,c ;
	
	Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double area() {
		return (a+b+c)/2;
	}
}

class Sphere extends Circle implements CalVolume{
	
	
	Sphere(double radius){
		super(radius);
	}
	public double volume() {
		return (4/3)* PI * radius * radius * radius;
	}
}

class Cuboid extends Square implements CalVolume{
	
	Cuboid(double side){
		super(side);
	}
	public double volume() {
		return side * side * side;
	}
}

public class ShapeInterface {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println(circle.area());
		
		Square square = new Square(15);
		System.out.println(square.area());
		
		Triangle triangle = new Triangle(10,11,12);
		System.out.println(triangle.area());
		
		Sphere sphere = new Sphere(2);
		System.out.println(sphere.area());
		System.out.println(sphere.volume());
		
		Cuboid cuboid = new Cuboid(5);
		System.out.println(cuboid.area());
		System.out.println(cuboid.volume());
	}
}









