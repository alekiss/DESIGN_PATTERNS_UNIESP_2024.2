package creational.builder;

public class Director {
    public void construirCarroEsportivo(IBuilder builder) {
        builder.setTipo("Esportivo");
        builder.setPortas(2);
        builder.setMotor("V8");
    }

    public void construirMotoEsportiva(IBuilder builder) {
        builder.setTipo("Esportiva");
        builder.setMotor("1000cc");
    }
}
