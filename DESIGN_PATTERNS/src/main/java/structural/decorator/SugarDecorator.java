package structural.decorator;

// Concrete Decorator: Decorador que adiciona açúcar
class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", açúcar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
