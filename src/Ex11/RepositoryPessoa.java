package Ex11;

public abstract class RepositoryPessoa {
    protected int quantidadeMulheres;
    static Pessoa [] pessoas = new Pessoa[10];

    public static void setPessoas(Pessoa pessoa, int i){
        pessoas[i] = pessoa;
    }

    public static Pessoa getPessoa(int id){
        Pessoa pessoa = null;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getId() == id){
                pessoa = pessoas[i];
            }
        }
        return pessoa;
    }
    public static Pessoa getMaiorAltura() {
        int pessoaAlta = 0;
        int comparadorMaior = 0;
        int comparadoMenor = 0;
        int pessoaMenor;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() > comparadorMaior) {
                comparadorMaior = pessoas[i].getAltura();
                pessoaAlta = pessoas[i].getId();
            }
            if(pessoas[i].getAltura() < comparadoMenor)[
                    comparadoMenor = pessoas[i].getAltura();
                    pessoaMenor = pessoas[i].getId();
        }
        return getPessoa(pessoaAlta);
    }

    public static int mediaAlturaHomens(){
        int soma = 0;
        int media = 0;
        int quant = 0;
        for(int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getSexo().equalsIgnoreCase("Masculino")){
                quant += 1;
                soma += pessoas[i].getAltura();
            }
        }
        return media = soma / quant;
    }

    public static int numeroMulheres(){
        int quant = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getSexo().equalsIgnoreCase("Feminino")){
                quant += 1;
            }
        }
        return quant;
    }
}
