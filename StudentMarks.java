package Assignment1;


public class StudentMarks {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result tolMarks = new Result("Rohan", 52, 100, 100, 100);
		System.out.println(tolMarks.calTotalMark());
		
	}

}

class Student{
	int rollNo;
	String name;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
}

class Exam extends Student{
	int maths;
	int physics;
	int chemistry;
	
	Exam(String name, int rollNo, int maths, int physics, int chemistry) {
		super(name, rollNo);
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		
	}
	
}

class Result extends Exam{
	
	int totalMark ;
	
	Result(String name, int rollNo, int maths, int physics, int chemistry) {
		super(name, rollNo, maths, physics, chemistry);
	}
	
	public int calTotalMark() {
		int total = 0;
		total = this.maths + this.physics + this.chemistry;
		return total;		
	}	
}





