package behavioral.observer;

// Classe concreta que implementa Observer
class Leitor implements Observer {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String conteudo) {
        System.out.println(nome + " recebeu nova notícia: " + conteudo);
    }
}
