package Ex11;

import java.util.Random;

public class Pessoa {
    private String nome;
    private String sexo;
    private int altura;
    private int id;

    Pessoa (String nome, String sexo, int altura){
        Random random = new Random();
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.id = random.nextInt(100);
    }

    public int getAltura() {
        return altura;
    }

    public int getId() {
        return id;
    }

    public String getSexo() {
        return sexo;
    }
}
