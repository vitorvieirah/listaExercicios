/*Escreva uma função que aceite um array de 10 inteiros (entre 0 e 9), que retorne uma string
    desses números na forma de um número de telefone.

    Exemplo:
        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class Ex39 {
//
//    public static void main(String[] args) {
//        System.out.println(createPhoneNumber(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
//    }
//
//    public static String createPhoneNumber(Integer[] numbers) {
//        int[] ddd  = new int[3];
//        int[] resultNumbers = new int[numbers.length - 3];
//        System.arraycopy(numbers, 0, ddd, 0, 3);
//        System.arraycopy(numbers, 3, resultNumbers, 0, numbers.length - 3);
//        String result = formatDDD(ddd);
//        result = result.concat(" ");
//        result = result.concat(formatResultNumber(resultNumbers));
//        return result;
//    }
//
//    private static String formatDDD(int[] numbers){
//        String result = "(";
//        for (Integer i : numbers)
//            result = result.concat(String.valueOf(i));
//
//        return result.concat(")");
//    }
//
//    private static String formatResultNumber(int[] numbers){
//        String result = "";
//
//        for (int i = 0; i < 3; i++) {
//            result = result.concat(String.valueOf(numbers[i]));
//        }
//
//        result = result.concat("-");
//
//        for(int i = 3; i < numbers.length; i++){
//            result = result.concat(String.valueOf(numbers[i]));
//        }
//
//        return result;
//    }
//}

public class Ex39 {

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2],
                numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}

