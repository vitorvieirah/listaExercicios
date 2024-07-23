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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Ex40 {
    public static void main(String[] args) {
        findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
    }

    public static int findIt(int[] a) {
        List<Integer> numbers = new ArrayList<>();
        for(Integer i : a){
            numbers.add(i);
        }

        numbers.sort(null);
        int cont = 1;
        int i;
        for (i = 0; i < numbers.size() - 1; i++) {
            if(Objects.equals(numbers.get(i), numbers.get(i + 1))){
                cont++;
            }else{
                if(cont % 2 == 1){
                    return numbers.get(i);
                }else{
                    cont = 1;
                }
            }
        }

        return numbers.get(i);
    }
}
