package creational.prototype;

public class Jogo {
    public static void main(String[] args) {
        // Criamos um protótipo para cada tipo de personagem
        Personagem prototipoGuerreiro = new Personagem("Guerreiro Base", "Guerreiro", 1);
        Personagem prototipoArqueiro = new Personagem("Arqueiro Base", "Arqueiro", 1);
        Personagem prototipoMago = new Personagem("Mago Base", "Mago", 1);

        // Clonamos os protótipos e personalizamos se necessário
        Personagem guerreiro1 = prototipoGuerreiro.clone();
        guerreiro1.setNome("Aragorn");

        Personagem arqueiro1 = prototipoArqueiro.clone();
        arqueiro1.setNome("Legolas");

        Personagem mago1 = prototipoMago.clone();
        mago1.setNome("Gandalf");

        // Exibindo informações dos personagens
        guerreiro1.mostrarInfo();
        arqueiro1.mostrarInfo();
        mago1.mostrarInfo();
    }
}
