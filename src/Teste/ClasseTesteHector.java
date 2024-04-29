package Teste;

public class ClasseTesteHector implements Sobreposicao{

    private String nome;
    private Integer idade;
    public String cpf;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void teste(){

    }

    //@Override
    public int metodAbs(int a, int b) {
        return a + b;
    }
}
