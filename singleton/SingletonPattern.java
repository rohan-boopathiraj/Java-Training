package singleton;


public class SingletonPattern {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance();
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance();
				
			}
		}).start();
	}
}
class MySingleTon{
	private MySingleTon() {
		System.out.println("singleton object created...");
	}
	private static MySingleTon obj;
	synchronized public static MySingleTon createInstance() {
		if(obj==null) {
			obj=new MySingleTon();
		}
		return obj;
	}
}

