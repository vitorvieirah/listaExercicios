import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex31 {

    /*
    Dado um número inteiro positivo "x" e um array de números inteiros positivos ordenados em ordem crescente
    sem repetição, determine dois numeros do array "nums" que mutiplicados resultam no numero "x" e cuja soma seja
    a menor possível

    Exemplos:

    Entrada:
        array "nums" = {2,5,8,10,16,40}
        target x = 80

    Saída:
        "[8, 10]"


    Casos de exceção:

    - Se não houver números que multiplicados cheguem ao número "x", retorna 0.0;
    - Se o array estiver vazio ou o tamanho for menor que 2 elementos, retorna 0.0;
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lista");
        int[] nums = Stream.of(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Numero");
        int x = sc.nextInt();

        System.out.println(Arrays.toString(resolver(nums, x)));
    }

    private static int[] resolver(int[] nums, int x){

        int [] numsM = new int[nums.length];
        int [] numsCertos = new int[2];
        int cont = 0;
        int soma = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < x){
                numsM[i] = nums[i];
            }
        }

        for (int i = 0; i < numsM.length; i++) {
            for (int j = i + 1; j < numsM.length; j++) {
                boolean validation = numsM[i] * numsM[j] == x;
                if(validation && cont == 1) {
                    if(numsM[i] + numsM[j] < soma) {
                        soma = numsM[i] + numsM[j];
                        numsCertos[0] = numsM[i];
                        numsCertos[1] = numsM[j];
                    }
                }

                if (validation && cont == 0) {
                    numsCertos[0] = numsM[i];
                    numsCertos[1] = numsM[j];
                    soma = numsM[i] + numsM[j];
                    cont++;
                }
            }
        }

        return numsCertos;
    }

}

