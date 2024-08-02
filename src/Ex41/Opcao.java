package Ex41;

import java.util.List;

public class Opcao {
    protected List<Integer> horizontal;
    protected List<Integer> vertical;
    protected Integer valor;

    public Opcao(List<Integer> horizontal, List<Integer> vertical, Integer valor) {
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.valor = valor;
    }
}
