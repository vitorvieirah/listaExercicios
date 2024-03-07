import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex32 {
    /*Complete a solução para que ela divida a string em pares de dois caracteres.
        Se a string contiver um número ímpar de caracteres, ela deverá substituir o segundo
        caractere ausente do par final por um sublinhado ('_').

        Exemplos:

        * 'abc' =>  ['ab', 'c_']
        * 'abcdef' => ['ab', 'cd', 'ef']

     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Vitor")));
    }

    private static String[] solution(String s){
        char[] chars = s.toCharArray();
        List<String> strings = new ArrayList<>();
        String result;

        if(chars.length % 2 == 0){
            for (int i = 1; i < chars.length; i += 2) {
                result = "";
                result = String.valueOf(chars[i - 1]);
                result = result.concat(String.valueOf(chars[i]));

                strings.add(result);
            }
        }else {
            for (int i = 1; i < chars.length - 1; i += 2) {
                result = "";
                result = String.valueOf(chars[i - 1]);
                result = result.concat(String.valueOf(chars[i]));

                strings.add(result);
            }
            result = "";
            result = String.valueOf(chars[chars.length - 1]);
            result = result.concat("_");
            strings.add(result);
        }

        String[] resultArray = new String[strings.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = strings.get(i);
        }

        return resultArray;
    }


}
