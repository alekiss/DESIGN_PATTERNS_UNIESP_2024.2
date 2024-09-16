package creational.builder;

public class MotoBuilder implements IBuilder {
    private Moto moto;

    public MotoBuilder() {
        this.moto = new Moto();
    }

    @Override
    public void setTipo(String tipo) {
        moto.setTipo(tipo);
    }

    @Override
    public void setPortas(int portas) {
        // Moto não tem portas, então ignoramos isso
    }

    @Override
    public void setMotor(String motor) {
        moto.setMotor(motor);
    }

    public Moto getResult() {
        return moto;
    }
}
