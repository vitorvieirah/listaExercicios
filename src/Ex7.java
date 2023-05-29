import java.sql.BatchUpdateException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
        //Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.



        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            System.out.println("Digite o numero que deseja conferir");
            double numero = sc.nextDouble();
            if(numero % 1 == 0){
                System.out.println("O numero é inteiro");
            }else {
                System.out.println("O numero é decimal");
            }
    }
}
