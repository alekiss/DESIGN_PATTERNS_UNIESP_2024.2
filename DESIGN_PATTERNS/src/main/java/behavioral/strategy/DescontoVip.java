package behavioral.strategy;

public class DescontoVip implements  DescontoStrategy{
    @Override
    public double calcular(double valor) {
        return valor * 0.15;
    }
}
