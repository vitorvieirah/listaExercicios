import java.util.Arrays;

public class Ex33 {
    /*Um isograma é uma palavra que não possui letras repetidas, consecutivas ou não consecutivas. Implemente uma função
     que determine se uma string que contém apenas letras é um isograma. Suponha que a string vazia seja um isograma.
     Ignore letras maiúsculas e minúsculas.

     Example: (Input --> Output)

     "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

     isIsogram "Dermatoglyphics" = true
     isIsogram "moose" = false
     isIsogram "aba" = false
     */

    public static void main(String[] args) {
        String s = "Dermatoglyphics";
        String s1 = "moose";
        System.out.println(isIsogram(s1));
    }

    public static boolean  isIsogram(String str) {
        String strU = str.toUpperCase();
        char[] letras;
        letras = strU.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            for (int j = i + 1; j < letras.length; j++) {
                if(letras[i] == letras[j])
                    return false;
            }
        }

        return true;
    }
}
