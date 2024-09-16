package creational.builder;

public class Carro {
    private String tipo;
    private int portas;
    private String motor;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipo='" + tipo + '\'' +
                ", portas=" + portas +
                ", motor='" + motor + '\'' +
                '}';
    }
}
