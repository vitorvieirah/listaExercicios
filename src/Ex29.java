import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

public class Ex29 {

    //Dados dois inteiros positivos "num1" e "num2", encontre o menor inteiro positivo que seja múltiplo
    // de ambos simultaneamente

    public static void main(String[] args) {
        System.out.println(resolucao(17,20));
    }


    private static int resolucao (int num1, int num2){
        int [] primos = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        List<Integer> mmc = new ArrayList<>();
        int i = 0;
        int contIf;
        int result = 1;

        while (num1 > 1 || num2 > 1){

            contIf = 0;

            if(num1 % 2 == 0){
                num1 = num1 / primos[i];
                mmc.add(primos[i]);
                contIf ++;
            }else {
                int j = 0;
                boolean stop = true;
                do {
                    if (num1 == primos[j]) {
                        mmc.add(primos[j]);
                        num1 = num1 / primos[j];
                        stop = false;
                    }
                    j ++;
                }while (stop && j < primos.length);

            }

            if(num2 % 2 == 0){
                num2 = num2 / primos[i];
                if(contIf < 1){
                    mmc.add(primos[i]);
                }
            }else if (contIf != 1){
                int j = 0;
                boolean stop = true;
                do{
                    if(num2 == primos[j]){
                        mmc.add(primos[j]);
                        num2 = num2 / primos[j];
                        stop = false;
                    }
                    j++;
                }while (stop && j < primos.length);
            }
        }

        for (Integer integer : mmc) {
            result = result * integer;
        }

        return result;
    }
}
