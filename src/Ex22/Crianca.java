package Ex22;

public class Crianca {
    private String sexo;
    private int idade;


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Crianca(String sexo, int idade){
        this.sexo = sexo;
        this.idade = idade;
    }

    public static Crianca criar(String sexo, int idade){
        return new Crianca(sexo,idade);
    }

}
