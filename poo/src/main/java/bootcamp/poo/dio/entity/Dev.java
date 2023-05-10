package bootcamp.poo.dio.entity;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> inscritos;
    private Set<Conteudo> concluidos;

    public Dev(String nome) {
        this.inscritos = new LinkedHashSet<Conteudo>();
        this.concluidos = new LinkedHashSet<Conteudo>();
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bc) {
        this.inscritos.addAll(bc.getConteudos());
        bc.getInscritos().add(this);
    }

    public String exibirCursos() {
        var sb = new StringBuilder();
        sb.append("Conteudo de " + nome);
        sb.append(" - Concluidos = [");
        for (var item : concluidos) {
            sb.append(item.getTitulo() + ", ");
        }
        sb.append("], Incritos=[");
        var it = this.inscritos.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getTitulo()+", ");
        }
        sb.append("].");
        return sb.toString();
    }

    public void progredir() {
        var achou = this.inscritos.stream().findFirst();
        if (achou.isPresent()) {
            this.concluidos.add(achou.get());
            this.inscritos.remove(achou.get());
        } else {
            System.err.println(this.nome + " não esta matriculado.");
        }
    }
    
    public double calcularTotalXp() {
        return this.concluidos.parallelStream()
                .mapToDouble(Conteudo::CalcularXp)
                .sum();
    } 

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null
                || this.getClass() != o.getClass())
            return false;
        var d = (Dev) o;
        return (Objects.equals(this.nome , d.getNome())
                && Objects.equals(this.inscritos, d.getInscritos())
                && Objects.equals(this.concluidos, d.getConcluidos()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome, this.inscritos, this.concluidos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getInscritos() {
        return inscritos;
    }

    public Set<Conteudo> getConcluidos() {
        return concluidos;
    }
    
}
