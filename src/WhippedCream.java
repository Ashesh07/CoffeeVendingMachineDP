package java_intermediate.design_patterns.decorator.coffeeVendingMachine;

public class WhippedCream implements Coffee{
    private static final double COST = 30.0;
    private static final String DESC = "Whipped Cream";

    private final Coffee coffee;

    WhippedCream(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return COST + coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + DESC;
    }
}
