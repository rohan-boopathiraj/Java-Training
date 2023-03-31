package bridgePattern;

public class VeggiePizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: " + toppings);
        System.out.println("Adding Cheese");
    }



}
