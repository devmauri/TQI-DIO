package bootcamp.poo.dio.entity;

/**
 * <h1> Conteudo</h1>
 * <p> O Conteúdo é tudo que um dev possa 
 * consumir ou alguém realizar uma mentoria.</p>
 */
public abstract class Conteudo implements iRecompensavel {
    private String titulo;
    private String desricao;
    protected final double XP_PADRAO = 10d;

    /**
     * Não exsite conteúdo sem titulo
     * @param titulo - Titulo do conteúdo.
     */
    public Conteudo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesricao() {
        return desricao;
    }

    public void setDesricao(String desricao) {
        this.desricao = desricao;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Titulo = " + this.getTitulo() + ", ");
        sb.append("Descrição = " + this.getDesricao() + ", ");
        sb.append("XP = " + String.valueOf(this.CalcularXp()));
        return sb.toString();
    }

}
