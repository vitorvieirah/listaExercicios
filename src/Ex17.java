//17 -  Calculo de fatorial

import java.util.Scanner;

public class Ex17 {


    public static String menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO QUE DESEJA QUE SEJE CALCULADO O FATORIAL:");
        return fatorial(sc.nextInt());
    }

    public static String  fatorial(int numero){
        int resto = 1;
        int [] fatorial = new int[numero];
        for (int i = 0; i < numero; i++) {
            fatorial[i] = numero - i;
        }
        for (int i = 0; i < fatorial.length; i++) {
             resto = resto * fatorial[i];
        }
        return "O RESULTADO DE:  " + numero + "! " + "  É:  " + resto;
    }
    public static void main(String[] args) {
        System.out.println(menu());
    }
}
