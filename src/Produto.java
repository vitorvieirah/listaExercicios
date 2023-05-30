public class Produto {
    private String nome;

    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }
    public String getNome() {
        return nome;
    }

    public String  getInfo(){
       return "NOME: " + getNome() + "VALOR: " + getValor();
    }

    public static Produto criar (String nome, double valor){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setValor(valor);
        return produto;
    }

}
