package structural.decorator;

// Client: Classe que usa os decorators para adicionar funcionalidades ao objeto
public class Main {
    public static void main(String[] args) {
        // Cliente cria um café simples
        Beverage coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " custa " + coffee.cost());

        // Adiciona leite ao café (Concrete Decorator MilkDecorator)
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " custa " + coffee.cost());

        // Adiciona açúcar ao café com leite (Concrete Decorator SugarDecorator)
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " custa " + coffee.cost());

        coffee = new ChocolateDecorator(coffee);
        System.out.println(coffee.getDescription() + " custa " + coffee.cost());
    }
}
