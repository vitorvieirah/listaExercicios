package Ex11;

import java.util.Scanner;

public class Ex11 {
    //11. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
    //a. a maior e a menor altura do grupo;
    //b. média de altura dos homens;
    //c. o número de mulheres.
    public static void menuCadastro(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite respectivamente o nome da pessoa, sexo e altura");
            Pessoa pessoa = new Pessoa();
            pessoa.setInfo(sc.next(), sc.next(), sc.nextDouble());
            PessoaRepository.setPessoas(pessoa , i);
        }
    }
    public static void infoFinal(){
        System.out.println("AS ALTURAS SÃO RESPECTIVAMENTE: " + PessoaRepository.getMaiorMenorAltura());
        System.out.println("A MÉDIA DE ALTURA DOS HOMENS É: " + PessoaRepository.mediaAlturaHomens());
        System.out.println("O NUMERO DE MULHERES É: " + PessoaRepository.numeroMulheres());
    }
    public static void main(String[] args) {
        menuCadastro();
        infoFinal();
    }
}
