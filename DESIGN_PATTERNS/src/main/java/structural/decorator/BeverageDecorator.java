package structural.decorator;

// Base Decorator: Decorador base para extras, implementa Beverage e mantém uma referência a uma bebida
abstract class BeverageDecorator extends Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
