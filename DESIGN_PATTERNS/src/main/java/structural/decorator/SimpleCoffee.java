package structural.decorator;

// Concrete Component: Café simples, que implementa a interface Beverage
class SimpleCoffee extends Beverage {
    @Override
    public String getDescription() {
        return "Café";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}