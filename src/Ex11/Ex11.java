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
            RepositoryPessoa.setPessoas(new Pessoa(sc.next(), sc.next(), sc.nextInt()), i);
        }
    }
    public static void infoFinal(){

    }
    public static void main(String[] args) {

    }
}
