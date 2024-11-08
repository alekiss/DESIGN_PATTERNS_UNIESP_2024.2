package creational.prototype;

public class Personagem implements Cloneable {
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome, String classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    // Método clone para criar uma cópia do objeto
    @Override
    public Personagem clone() {
        return new Personagem(this.nome, this.classe, this.nivel);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Classe: " + classe + ", Nível: " + nivel);
    }
}
