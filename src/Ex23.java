import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex23 {
    //Dado um número aleatório não negativo, você deve retornar os dígitos desse número em uma matriz na ordem inversa.
    public static void main(String[] args) {
        int [] num = teste(5412);
        for(int a: num){
            System.out.println(a);
        }
    }

    public static int[] teste(long n){
        if (n == 0) {
            return new int[]{0};
        }

        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add((int) (n % 10));
            n /= 10;
        }

        int[] result = new int[digits.size()];
        for (int i = 0; i < digits.size(); i++) {
            result[i] = digits.get(i);
        }

        return result;
    }
}
