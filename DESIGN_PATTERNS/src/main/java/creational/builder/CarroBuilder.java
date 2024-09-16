package creational.builder;

public class CarroBuilder implements IBuilder {
    private Carro carro;

    public CarroBuilder() {
        this.carro = new Carro();
    }

    @Override
    public void setTipo(String tipo) {
        carro.setTipo(tipo);
    }

    @Override
    public void setPortas(int portas) {
        carro.setPortas(portas);
    }

    @Override
    public void setMotor(String motor) {
        carro.setMotor(motor);
    }

    public Carro getResult() {
        return carro;
    }
}
