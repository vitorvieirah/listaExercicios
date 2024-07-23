/*
Dado um array de inteiros, encontre aquele que aparece um número ímpar de vezes.

Sempre haverá apenas um número inteiro que aparece um número ímpar de vezes.

Exemplos
[7] deve retornar 7, porque ocorre 1 vez (o que é ímpar).
[0] deve retornar 0, porque ocorre 1 vez (o que é ímpar).
[1,1,2] deve retornar 2, porque ocorre 1 vez (o que é ímpar).
[0,1,0,1,0] deve retornar 0, pois ocorre 3 vezes (o que é ímpar).
[1,2,2,3,3,3,4,3,3,3,2,2,1] deve retornar 4, porque aparece 1 vez (o que é ímpar).
 */

import java.util.HashMap;
import java.util.Map;

public class Ex40 {
    public static void main(String[] args) {
        int result = findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
        System.out.println("O número que aparece um número ímpar de vezes é: " + result);
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : countMap.keySet()) {
            if (countMap.get(num) % 2 != 0) {
                return num;
            }
        }

        throw new IllegalArgumentException("Nenhum número com contagem ímpar encontrado.");
    }
}

