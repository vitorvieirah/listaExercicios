/*
Sua tarefa é criar uma função que possa receber qualquer número inteiro não negativo como argumento
e retorná-lo com seus dígitos em ordem decrescente. Essencialmente,
reorganize os dígitos para criar o número mais alto possível.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        System.out.println("Número ordenado em ordem decrecente: " + sortDesc(sc.nextInt()));
    }

    public static int sortDesc(final int num) {
        return Integer.parseInt(formatVetorToString(sortVetor(String.valueOf(num).toCharArray())));
    }

    private static char[] sortVetor(char[] characters){
        int tamVetor = characters.length;
        while (tamVetor > 0){
            for (int i = 0; i < tamVetor - 1; i++) {
                char aux;
                if(characters[i] < characters[i + 1]){
                    aux = characters[i];
                    characters[i] = characters[i + 1];
                    characters[i + 1] = aux;
                }
            }
            tamVetor--;
        }
        return characters;
    }

    private static String formatVetorToString(char[] chars){
        String result = "";
        for(Character c : chars)
            result = result.concat(String.valueOf(c));

        return result;
    }
}
