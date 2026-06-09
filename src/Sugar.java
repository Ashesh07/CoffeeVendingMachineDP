package java_intermediate.design_patterns.decorator.coffeeVendingMachine;

public class Sugar implements Coffee{
    private static final double COST = 10.0;
    private static final String DESC = "Sugar";

    private final Coffee coffee;

    Sugar(Coffee coffee){
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
