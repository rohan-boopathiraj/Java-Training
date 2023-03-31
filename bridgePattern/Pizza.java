package bridgePattern;

public abstract class Pizza {

     String sauce;
     String toppings;


    public abstract void assemble();
    
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}


}
