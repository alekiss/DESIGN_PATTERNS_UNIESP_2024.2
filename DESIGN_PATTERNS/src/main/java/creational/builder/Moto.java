package creational.builder;

public class Moto {
    private String tipo;
    private String motor;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipo='" + tipo + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
