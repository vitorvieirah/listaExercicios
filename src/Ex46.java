/*
3264. Estado final da matriz após K operações de multiplicação I
Fácil
Tópicos
Empresas
Dica
Você recebe uma matriz de inteiros nums, um inteiro ke um inteiro multiplier.

Você precisa executar koperações em nums. Em cada operação:

Encontre o valor mínimox em nums. Se houver várias ocorrências do valor mínimo, selecione a que aparecer primeiro .
Substitua o valor mínimo selecionado xpor x * multiplier.
Retorna uma matriz de inteiros denotando o estado finalnums após a execução de todas kas operações.



Exemplo 1:

Entrada: nums = [2,1,3,5,6], k = 5, multiplicador = 2

Saída: [8,4,6,5,6]

Explicação:

Operação	Resultado
Após a operação 1	[2, 2, 3, 5, 6]
Após a operação 2	[4, 2, 3, 5, 6]
Após a operação 3	[4, 4, 3, 5, 6]
Após a operação 4	[4, 4, 6, 5, 6]
Após a operação 5	[8, 4, 6, 5, 6]
Exemplo 2:

Entrada: nums = [1,2], k = 3, multiplicador = 4

Saída: [16,8]

Explicação:

Operação	Resultado
Após a operação 1	[4, 2]
Após a operação 2	[4, 8]
Após a operação 3	[16, 8]


Restrições:

1 <= nums.length <= 100
1 <= nums[i] <= 100
1 <= k <= 10
1 <= multiplier <= 5
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex46 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2)));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        List<Integer> numsList = new ArrayList<>(Arrays
                .stream(nums)
                .boxed()
                .toList());

        for (int i = 0; i < k; i++) {
            Optional<Integer> menorNumero = numsList.stream().min(Integer::compareTo);
            if(menorNumero.isEmpty()) {
                throw new RuntimeException("Menor número não encontrado");
            }

            int indexMenorNumero = numsList.indexOf(menorNumero.get());

            numsList.set(indexMenorNumero, menorNumero.get() * multiplier);
        }

        return numsList.stream().mapToInt(Integer::intValue).toArray();
    }
}
