package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        double valorCompra = 184.0;

        // Cliente normal
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto(new DescontoNormal());
        System.out.println("Desconto Normal: " + calculadora.calcular(valorCompra));

        // Cliente VIP
        calculadora.setDescontoStrategy(new DescontoVip());
        System.out.println("Desconto VIP: " + calculadora.calcular(valorCompra));

        // Cliente Estudante
        calculadora.setDescontoStrategy(new DescontoEstudante());
        System.out.println("Desconto Estudante: " + calculadora.calcular(valorCompra));
    }
}
