package bootcamp.poo.dio;

import java.time.LocalDate;

import bootcamp.poo.dio.entity.Bootcamp;
import bootcamp.poo.dio.entity.Curso;
import bootcamp.poo.dio.entity.Dev;
import bootcamp.poo.dio.entity.Mentoria;

public class App 
{
    public static void main( String[] args )
    {
        Curso c1 = new Curso("Curso Java-A");
        c1.setDesricao("Curso de java basico.");
        c1.setCargaHoraria(2);

        Curso c2 = new Curso("Curso Java-B");
        c2.setDesricao("Curso de java intermediario.");
        c2.setCargaHoraria(5);

        Mentoria m1 = new Mentoria("Mentoria em java.");
        m1.setData(LocalDate.now());
        m1.setDesricao("Mentoria pra java agora.");
        
        Bootcamp b1 = new Bootcamp("Bootcamp JAVA", LocalDate.now().plusDays(5));
        b1.setDescricao("Bootcamp devem ter nome e datas finais.");
        b1.getConteudos().add(m1);
        b1.getConteudos().add(c1);
        b1.getConteudos().add(c2);

        Dev d1 = new Dev("José da Silva");
        d1.inscreverBootcamp(b1);
        d1.progredir();
        
        Dev d2 = new Dev("Maria Betania");
        d2.inscreverBootcamp(b1);
        d2.progredir();
        d2.progredir();
        d2.progredir();

        System.out.println(b1);
        System.out.println("XP atual de cada participante: ");
        for (var item : b1.getInscritos()) {
            System.out.println(item.getNome() + " - "+ item.calcularTotalXp());
        }                
    }
}
