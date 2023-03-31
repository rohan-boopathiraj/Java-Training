package bridgePattern;

public class BridgeMain {

    /*
     * Video Reference: https://youtu.be/88kAIisOiYs
     */
    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }

}