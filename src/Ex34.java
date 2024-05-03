import java.util.ArrayList;
import java.util.List;

public class Ex34 {
    /*
        Conclua a função que aceita um parâmetro de string e inverte cada palavra da string.
        Todos os espaços na string devem ser mantidos.

        Exemplos

        "This is an example!" ==> "sihT si na !elpmaxe"
        "double  spaces"      ==> "elbuod  secaps"
     */


    public static void main(String[] args) {
        reverseWords("This is an example!");
    }

    public static String reverseWords(final String original) {
        char[] word = original.toCharArray();
        List<String> frases = new ArrayList<>();
        List<String> frasesReverse = new ArrayList<>();
        int contEspa = 0;
        String frase = "";

        for (int i = 0; i < word.length; i++) {
            if(word[i] != ' '){
                frase = frase.concat(String.valueOf(word[i]));
            }else {
                contEspa ++;
                frases.add(frase);
                frase = "";
            }

            if(i == word.length - 1)
                frases.add(frase);
        }

        for (String s : frases){
            char[] wordReverse = s.toCharArray();
            s = " ";

            for (int i = wordReverse.length - 1; i >= 0; i--) {
                s = s.concat(String.valueOf(wordReverse[i]));
            }

            frasesReverse.add(s);
        }

        frasesReverse.forEach(System.out::println);

        return null;
    }
}
