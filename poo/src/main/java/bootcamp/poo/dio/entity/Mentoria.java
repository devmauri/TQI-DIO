package bootcamp.poo.dio.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria(String titulo) {
        super(titulo);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double CalcularXp() {
        return this.XP_PADRAO * 2; 
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Mentoria-{");
        sb.append( super.toString() + ", ");
        sb.append("Data = "
                    + this.data.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
        sb.append("}");
        return sb.toString();
    }
}
