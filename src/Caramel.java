package java_intermediate.design_patterns.decorator.coffeeVendingMachine;

public class Caramel implements Coffee{
    private static final double COST = 25.0;
    private static final String DESC = "Caramel";

    private final Coffee coffee;

    Caramel(Coffee coffee){
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
