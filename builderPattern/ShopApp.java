package builderPattern;

public class ShopApp {

	public static void main(String[] args) {
		
//		Phone p = new Phone("IOS","A14 Bionic", 4, (float) 5.5, 4000);
//		System.out.println(p);
		
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		System.out.println(p);
		
	}	

}
