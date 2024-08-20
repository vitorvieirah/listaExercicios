package Ex41;

import java.util.List;

public class Combinacao {
    private List<Endereco> combinacao;

    public Combinacao(List<Endereco> combinacao) {
        this.combinacao = combinacao;
    }

    public List<Endereco> getCombinacao() {
        return combinacao;
    }

    public void setCombinacao(List<Endereco> combinacao) {
        this.combinacao = combinacao;
    }

    @Override
    public String toString() {
        return "Combinacao{" +
                "combinacao=" + combinacao +
                '}';
    }
}
