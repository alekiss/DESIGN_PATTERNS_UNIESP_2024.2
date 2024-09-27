package creational.factory_method;

class SistemaRelatorio extends SistemaDocumentos {
    protected Documento criarDocumento() {
        return new Relatorio();
    }
}
