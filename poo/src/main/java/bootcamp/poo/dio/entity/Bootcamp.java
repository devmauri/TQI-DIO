package bootcamp.poo.dio.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio;
    private LocalDate dataFinal;
    private Set<Dev> inscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, LocalDate termino) {
        this.dataInicio = LocalDate.now();
        this.nome = nome;
        this.dataFinal = termino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public Set<Dev> getInscritos() {
        return inscritos;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("\nBootcamp - " + nome + "\n\n");
        sb.append("Conteudos: \n");
        for (var item : conteudos) {
            sb.append("\t" + item + "\n");
        }
        sb.append("\nInscritos: \n");
        for (var item : inscritos) {
            sb.append(item.getNome() + ", ");
        }
        sb.append("\n\nStatus de cada desenvolvedor:\n");
        for (var item : inscritos) {
            sb.append(item.exibirCursos() + "\n");
        }
        
        return sb.toString();
    }
}
