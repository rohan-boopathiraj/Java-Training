package factoryPattern;

public class OSFactory {
	public OperatingSystem getInstance(String str) {
		if(str.equals("affortable")) {
			return new Android();
		}
		else if(str.equals("expensive")) {
			return new Apple();
		}
		return new Android();
	}
	
} 
