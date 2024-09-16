package creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Construir um carro esportivo
        CarroBuilder carroBuilder = new CarroBuilder();
        director.construirCarroEsportivo(carroBuilder);
        Carro carroEsportivo = carroBuilder.getResult();
        System.out.println(carroEsportivo);

        // Construindo uma moto esportiva
        MotoBuilder motoBuilder = new MotoBuilder();
        director.construirMotoEsportiva(motoBuilder);
        Moto motoEsportiva = motoBuilder.getResult();
        System.out.println(motoEsportiva);
    }
}
