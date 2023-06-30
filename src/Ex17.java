//17 -  Calculo de fatorial

import java.util.Scanner;

public class Ex17 {


    public static String menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO QUE DESEJA QUE SEJE CALCULADO O FATORIAL:");
        return fatorial(sc.nextInt());
    }

    public static String  fatorial(int numero){
        int numResultado = 0;
        int numOriginal = numero;
        while(numero > 0) {
            numero = numero - 1;
        
        }
        return "O RESULTADO DE:  " + numero + " ! " + "  É:  " + numResultado;
    }
    public static void main(String[] args) {
        System.out.println(menu());
    }
}
