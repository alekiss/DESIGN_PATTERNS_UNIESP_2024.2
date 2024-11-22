package behavioral.strategy;

public class CalculadoraDeDesconto {
    private DescontoStrategy descontoStrategy;

    public CalculadoraDeDesconto(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcular(double valor) {
        return descontoStrategy.calcular(valor);
    }
}
