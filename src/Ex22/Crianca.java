package Ex22;

public class Crianca {
    private String sexo;
    private int idade;
    private boolean viva;


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

    public boolean getViva() {
        return viva;
    }

    public Crianca(String sexo, int idade, boolean viva){
        this.sexo = sexo;
        this.idade = idade;
        this.viva = viva;
    }

    public static Crianca criar(String sexo, int idade, boolean viva){
        return new Crianca(sexo,idade, viva);
    }

}
