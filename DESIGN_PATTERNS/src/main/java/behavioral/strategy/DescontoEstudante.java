package behavioral.strategy;

public class DescontoEstudante implements DescontoStrategy{
    @Override
    public double calcular(double valor) {
        return valor * 0.10;
    }
}
