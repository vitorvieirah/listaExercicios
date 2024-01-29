import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {
        String nome = "Vitor";
        String nomeInv = "";

        System.out.println(nome);

        char[] palavra = nome.toCharArray();
        int size = palavra.length;
        char[] palabraInv = new char[size];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            palabraInv[j] = palavra[i];
            j++;
        }

        for (int i = 0; i < size; i++) {
            nomeInv = nomeInv.concat(String.valueOf(palabraInv[i]));
        }

        System.out.println(nomeInv);
    }
}
