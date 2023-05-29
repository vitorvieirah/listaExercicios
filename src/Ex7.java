import java.sql.BatchUpdateException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
        //Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.


        public static boolean validarNumero(double numero){
            String numComp = String.valueOf(numero);
            return numComp.contains(".0");
        }
        public static double menu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o numero que deseja comparar:");
            return sc.nextDouble();
        }
        public static void main(String[] args) {
            if(validarNumero(menu())){
                System.out.println("O nuemro não é decimal");
            }else{
                System.out.println("O numero é decimal");
            }
    }
}
