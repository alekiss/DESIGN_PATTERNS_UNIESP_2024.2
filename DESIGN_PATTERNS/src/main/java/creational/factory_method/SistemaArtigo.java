package creational.factory_method;

public class SistemaArtigo extends SistemaDocumentos{
    @Override
    protected Documento criarDocumento() {
        return new Artigo();
    }
}
