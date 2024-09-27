package creational.factory_method;

public class Main {
    public static void main(String[] args) {
        SistemaDocumentos sistema = new SistemaRelatorio();
        sistema.processarDocumento();  // Saída: Gerando relatório...

        sistema = new SistemaResumo();
        sistema.processarDocumento();  // Saída: Gerando resumo...
    }
}