package creational.factory_method;

abstract class SistemaDocumentos {
    public void processarDocumento() {
        Documento doc = criarDocumento();
        doc.gerar();
    }

    // Factory Method
    protected abstract Documento criarDocumento();
}
