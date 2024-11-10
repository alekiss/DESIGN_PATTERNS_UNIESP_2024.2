package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Sujeito que notifica observadores (Publisher)
class Noticia {
    private List<Observer> leitores = new ArrayList<>();
    private String conteudo;

    public void adicionarLeitor(Observer leitor) {
        leitores.add(leitor);
    }

    public void removerLeitor(Observer leitor) {
        leitores.remove(leitor);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
        notificarLeitores();
    }

    private void notificarLeitores() {
        for (Observer leitor : leitores) {
            leitor.atualizar(conteudo);
        }
    }
}
