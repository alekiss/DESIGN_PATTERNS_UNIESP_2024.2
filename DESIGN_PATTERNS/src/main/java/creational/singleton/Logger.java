package creational.singleton;

public class Logger {
    // Instância única (Singleton)
    private static Logger instance;

    // Construtor privado para evitar a criação de novas instâncias
    private Logger() {}

    // Método para obter a única instância da classe
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}