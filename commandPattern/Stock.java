package commandPattern;

public class Stock {
	
	   private String name = "ABC";
	   private int quantity = 10;

	   public void buy(){
	      System.out.println("Stock [ Name: "+name+", "+quantity + " quantity ] bought");
	   }
	   public void sell(){
	      System.out.println("Stock [ Name: "+name+", "+ quantity+ " quantity ] sold ");
	   }
	}


 class BuyStock implements Order {
	   private Stock abcStock;

	   public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.buy();
	   }
	}
 
 
  class SellStock implements Order {
	   private Stock abcStock;

	   public SellStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.sell();
	   }
	}