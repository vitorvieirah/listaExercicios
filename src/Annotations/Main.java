package Annotations;

public class Main {

    public String getNome() {
        return nome;
    }

    @MyAnnotation(nome = "Vitor")
    private String nome;

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.nome);
    }
}
