import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
        //Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double numero = sc.nextDouble();
            DecimalFormat formato = new DecimalFormat("#");
            System.out.println(formato.format(numero));
    }
}
