package structural.decorator;

// Concrete Decorator: Decorador que adiciona leite
class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", leite";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }
}
