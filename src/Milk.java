package java_intermediate.design_patterns.decorator.coffeeVendingMachine;

public class Milk implements Coffee{
    private static final double COST = 20.0;
    private static final String DESC = "Milk";

    private final Coffee coffee;

    Milk(Coffee coffee){
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
