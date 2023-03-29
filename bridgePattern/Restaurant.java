package bridgePattern;

public abstract class Restaurant {

    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addToppings();

    public void deliver() {

        addSauce();
        addToppings();
        pizza.assemble();
        System.out.println("Order in Progress!");
    }

}
