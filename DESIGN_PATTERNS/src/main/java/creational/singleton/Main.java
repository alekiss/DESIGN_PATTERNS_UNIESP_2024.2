package creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Uso em diferentes partes do código:
        Logger logger1 = Logger.getInstance();
        logger1.log("Iniciando aplicação");

        Logger logger2 = Logger.getInstance();
        logger2.log("Usuário fez login");
    }
}
