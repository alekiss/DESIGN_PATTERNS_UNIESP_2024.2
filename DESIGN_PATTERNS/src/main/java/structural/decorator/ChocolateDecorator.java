package structural.decorator;

// Novo decorator para chocolate
class ChocolateDecorator extends BeverageDecorator {
    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.5;
    }
}
