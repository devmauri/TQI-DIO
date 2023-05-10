package bootcamp.poo.dio.entity;

/**
 * <h1>iRecompensavel</h1>
 * Interface para ser implementada em tudo que conceda 
 * recompensas em forma de experiência.
 */
public interface iRecompensavel {

    /**
     * Informa os pontos de experiência adquirios
     * após a conclusão do conteúdo.
     * @return pontos de experiência
     */
    double CalcularXp();

}