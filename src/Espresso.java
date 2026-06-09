package java_intermediate.design_patterns.decorator.coffeeVendingMachine;

public class Espresso implements Coffee{

    private static final double COST = 100.0;
    private static final String DESC = "Espresso";

    private final Coffee coffee;

    //Base constructor - very first layer (Base variant)
    public Espresso() {
        this.coffee = null;
    }

    //Decorator constructor - wraps an existing icecream
    Espresso(Coffee coffee){
        this.coffee = coffee;   //coffee already defined (adding on top)
    }


    @Override
    public double getCost() {
        if(coffee == null) return COST;
        //COST = new cost (espresso)
        //coffee.getCost() = existing layer (coffee)
        return COST + coffee.getCost();
    }

    @Override
    public String getDescription() {
        if(coffee == null) return DESC;
        return coffee.getDescription() + " + " + DESC;
    }
}
