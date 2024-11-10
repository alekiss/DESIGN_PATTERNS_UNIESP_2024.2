package behavioral.observer;

// Uso do padrão Observer (Client)
public class Main {
    public static void main(String[] args) {
        Noticia noticia = new Noticia();

        Leitor leitor1 = new Leitor("Leitor 1");
        Leitor leitor2 = new Leitor("Leitor 2");

        noticia.adicionarLeitor(leitor1);
        noticia.adicionarLeitor(leitor2);

        noticia.setConteudo("Padrão Observer implementado com sucesso!");
    }
}
