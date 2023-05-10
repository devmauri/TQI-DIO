package bootcamp.poo.dio.entity;

public class Curso extends Conteudo {

    private float cargaHoraria;

    public Curso(String titulo) {
        super(titulo);
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double CalcularXp() {
        return this.XP_PADRAO * cargaHoraria;
    }
    
    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Curso-{");
        sb.append( super.toString() + ", ");
        sb.append("Carga = " + (int)cargaHoraria + "}");
        return sb.toString();
    }

}
