package creational.factory_method;

class SistemaResumo extends SistemaDocumentos {
    protected Documento criarDocumento() {
        return new Resumo();
    }
}