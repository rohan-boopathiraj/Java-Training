package Assignment3;

class CreateThread extends Thread{
	StringBuffer str;
	
	CreateThread(StringBuffer str){
		this.str = str;
	}
	
	@Override
	public void run() {

		int count = 0;
		
		synchronized(str) {
			for(int i=0; i<100; i++) {
				System.out.print(str);
				count++;
			}
			
			char ch = str.charAt(0);
			str.setCharAt(0, ++ch);
			System.out.println(count);
		}
	}
}


public class Excercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("A");
		
		CreateThread t1 = new CreateThread(str);
		CreateThread t2 = new CreateThread(str);
		CreateThread t3 = new CreateThread(str);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	

}
