package Ex11;

import java.util.Random;
import java.util.SimpleTimeZone;

public class Pessoa {
    private String nome;
    private String sexo;
    private double altura;
    private int id;


    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    Pessoa (){
        Random random = new Random();
        setId(random.nextInt(100));
    }

    public double getAltura() {
        return altura;
    }

    public int getId() {
        return id;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }
    public void setInfo(String nome, String sexo, double altura){
        setNome(nome);
        setSexo(sexo);
        setAltura(altura);
    }
}
