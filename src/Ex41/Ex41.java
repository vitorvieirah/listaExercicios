package Ex41;/*
Certo, detetive, um dos nossos colegas observou com sucesso nossa pessoa-alvo, Robby, o ladrão. Nós o seguimos até um
depósito secreto, onde presumimos encontrar todas as coisas roubadas. A porta deste depósito é protegida por uma
fechadura de combinação eletrônica. Infelizmente, nosso espião não tem certeza sobre o PIN que viu quando Robby o digitou.

O teclado tem o seguinte layout:

┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │ 9 │
└───┼───┼───┘
    │ 0 │
    └───┘
Ele observou o PIN 1357, mas também disse que é possível que cada um dos dígitos que ele viu possa ser, na verdade,
outro dígito adjacente (horizontal ou verticalmente, mas não diagonalmente). Por exemplo, em vez de , 1também pode
ser 2ou 4. E em vez de , 5também pode ser 2, 4, 6ou 8.

Ele também mencionou que conhece esse tipo de trava. Você pode digitar uma quantidade ilimitada de PINs errados,
eles nunca bloqueiam o sistema ou soam o alarme. É por isso que podemos experimentar todas as variações possíveis (*).

* possível no sentido de: o próprio PIN observado e todas as variações considerando os dígitos adjacentes

Você pode nos ajudar a encontrar todas essas variações? Seria legal ter uma função que retornasse um array
(ou uma lista em Java/Kotlin e C#) de todas as variações para um PIN observado com um comprimento de 1 a 8 dígitos.
Poderíamos nomear a função getPINs( get_pinsem python, GetPINsem C#). Mas observe que todos os PINs, o observado e
também os resultados, devem ser strings, por causa de '0's iniciais potenciais. Já preparamos alguns casos de teste para você.

Detetive, contamos com você!
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex41 {

    public static void main(String[] args) {
        getPINs("23").forEach(System.out::println);
    }

    public static Stream<String> getPINs(String observed) {
        int tamSenha = observed.length();
        char[] chars = observed.toCharArray();
        int[][] matriz = new int[3][3];
        Endereco[] enderecos = new Endereco[2];
        List<Endereco> combinacoes = new ArrayList<>();


        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = value;
                value++;
            }
        }


        for (int i = 0; i < 2; i++) {
            int valor = Integer.parseInt(String.valueOf(chars[i]));
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (matriz[j][k] == valor) {
                        enderecos[i] = new Endereco(j, k);
                    }
                }
            }
        }

        for (Endereco end : enderecos) {
            switch (end.getLinha()) {
                case 0 -> {
                    if (end.getColuna() != 0)
                        combinacoes.add(new Endereco(end.getColuna() - 1, end.getLinha()));
                    if (end.getColuna() != 2)
                        combinacoes.add(new Endereco(end.getColuna() + 1, end.getLinha()));

                    combinacoes.add(new Endereco(end.getColuna(), end.getLinha() + 1));
                }
                case 1 -> {
                    if (end.getColuna() != 0)
                        combinacoes.add(new Endereco(end.getColuna() - 1, end.getLinha()));

                    if (end.getColuna() != 2)
                        combinacoes.add(new Endereco(end.getColuna() + 1, end.getLinha()));

                    combinacoes.add(new Endereco(end.getColuna(), end.getLinha() + 1));
                    combinacoes.add(new Endereco(end.getColuna(), end.getLinha() - 1));
                }
                default -> {
                    if (end.getColuna() != 0)
                        combinacoes.add(new Endereco(end.getColuna() - 1, end.getLinha()));
                    if (end.getColuna() != 2)
                        combinacoes.add(new Endereco(end.getColuna() + 1, end.getLinha()));

                    combinacoes.add(new Endereco(end.getColuna(), end.getLinha() - 1));
                }
            }
        }

        return combinacoes
                .stream()
                .map(endereco -> endereco.getColuna() + String.valueOf(endereco.getLinha()));
    }
}
