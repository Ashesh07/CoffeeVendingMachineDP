package java_intermediate.design_patterns.decorator.coffeeVendingMachine;

public class HouseBlend implements Coffee{
    private static final double COST = 80.0;
    private static final String DESC = "HouseBlend";

    private final Coffee coffee;

    public HouseBlend() {
        this.coffee = null;
    }

    //Decorator constructor - wraps an existing icecream
    HouseBlend(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        if(coffee == null) return COST;
        return COST + coffee.getCost();
    }

    @Override
    public String getDescription() {
        if(coffee == null) return DESC;
        return coffee.getDescription() + " + " + DESC;
    }
}
