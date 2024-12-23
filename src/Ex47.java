/*
Uma diagonal de matriz é uma linha diagonal de células começando de alguma célula na linha mais alta ou na coluna
mais à esquerda e indo na direção inferior direita até atingir o fim da matriz. Por exemplo, a diagonal da
matriz começando de mat[2][0], onde maté uma 6 x 3matriz, inclui células mat[2][0], mat[3][1], e mat[4][2].

Dada uma m x nmatriz matde inteiros, classifique cada diagonal da matriz em ordem crescente e retorne a matriz resultante .

*/

import java.util.Arrays;

public class Ex47 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ordenaDiagonal(new int[]{1, 45, 3, 2, 87, 10
        })));
    }

    public static int[][] diagonalSort(int[][] mat) {
        return null;
    }

    private static int[] ordenaDiagonal(int[] diagonal) {
        for (int i = 0; i < diagonal.length - 1; i++) {
            for (int j = i + 1; j < diagonal.length; j++) {
                if(diagonal[i] > diagonal[j]) {
                    int aux = diagonal[i];
                    diagonal[i] = diagonal[j];
                    diagonal[j] = aux;
                }
            }
        }

        return diagonal;
    }
}




