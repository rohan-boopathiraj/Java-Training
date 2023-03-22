package factoryPattern;

public class FactoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OSFactory osFactory = new OSFactory();
		
		OperatingSystem os = osFactory.getInstance("expensive");
		os.OSName();
	}

}
