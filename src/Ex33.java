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
        String s2 = "aba";
        System.out.println(isIsogram(s2));
    }

    public static boolean  isIsogram(String str) {
        String strU = str.toUpperCase();
        char[] letras;
        letras = strU.toCharArray();
        char[] letrasOrdenadas = ordenaVetor(letras);
        for (int i = 0; i < letrasOrdenadas.length - 1; i++) {
            if(letrasOrdenadas[i] == letrasOrdenadas[i + 1])
                return false;
        }
        return true;
    }
    
    private static char[] ordenaVetor(char[] vetor){
        int tamVetor = vetor.length;

        while(tamVetor > 0){
            for (int i = 0; i < tamVetor - 1; i++) {
                char aux;
                if(vetor[i] > vetor[i + 1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
            tamVetor --;
        }

        return vetor;
    }
}
