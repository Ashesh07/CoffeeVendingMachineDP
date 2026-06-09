package java_intermediate.design_patterns.decorator.coffeeVendingMachine;

public class Client {
    public static void main(String[] args) {

        Coffee coffee1 = new Caramel(
                new WhippedCream(
                        new HouseBlend()
                )
        );

        System.out.println("Coffee Cost : ₹" + coffee1.getCost());
        System.out.println("Coffee Description : " + coffee1.getDescription());

        System.out.println("----------------------------------------------------------");

        Coffee coffee2 = new Milk(
                new HouseBlend(
                        new Sugar(
                                new Espresso()
                        )
                )
        );

        System.out.println("Coffee Cost : ₹" + coffee2.getCost());
        System.out.println("Coffee Description : " + coffee2.getDescription());

        System.out.println("----------------------------------------------------------");

        Coffee coffee3 = new Espresso();

        System.out.println("Coffee Cost : ₹" + coffee3.getCost());
        System.out.println("Coffee Description : " + coffee3.getDescription());

        System.out.println("----------------------------------------------------------");
    }
}
