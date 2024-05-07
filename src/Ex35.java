import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex35 {
    /*O objetivo deste exercício é converter uma string em uma nova string, onde cada caractere da nova string aparece
        "("se esse caractere aparecer apenas uma vez na string original ou ")"se esse caractere aparecer mais de uma vez
        na string original. Ignore as letras maiúsculas ao determinar se um caractere é duplicado.

        Exemplos
        "din"      =>  "((("
        "recede"   =>  "()()()"
        "Success"  =>  ")())())"
        "(( @"     =>  "))(("
     */

    public static void main(String[] args) {
        String t1 = "recede";
        System.out.println(encode(t1));
    }

    static String encode(String word){
        char [] string = word.toUpperCase().toCharArray();
        char [] stringOrdenada = ordenaVetor(string);
        Set<Character> charsRepitidas = new HashSet<>();

        for (int i = 0; i < stringOrdenada.length - 1; i++) {
            if(stringOrdenada[i] == stringOrdenada[i + 1])
                charsRepitidas.add(stringOrdenada[i]);
        }
        String newWord = "";

        boolean repetido = false;
        for (int i = 0; i < string.length; i++) {
            for(Character c : charsRepitidas){
                if(string[i] == c){
                    repetido = true;
                }
            }

            if(repetido)
                newWord = newWord.concat(")");
            else
                newWord = newWord.concat("(");

            repetido = false;
        }

        return newWord;
    }

    private static char[] ordenaVetor(char[] vetor){
        int tamVetor = vetor.length;
        char [] vetorOrdenado = new char[tamVetor];

        System.arraycopy(vetor, 0, vetorOrdenado, 0, tamVetor);

        while(tamVetor > 0){
            for (int i = 0; i < tamVetor - 1; i++) {
                char aux;
                if(vetorOrdenado[i] > vetorOrdenado[i + 1]){
                    aux = vetorOrdenado[i];
                    vetorOrdenado[i] = vetorOrdenado[i + 1];
                    vetorOrdenado[i + 1] = aux;
                }
            }
            tamVetor --;
        }

        return vetorOrdenado;
    }

}
