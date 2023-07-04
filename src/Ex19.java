import java.security.SecureRandom;
import java.util.Scanner;

public class Ex19 {
    //19. Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
    //a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
    //b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.

    public static String menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O SEU PESO: ");
        return calculoPeso(sc.nextDouble());
    }

    public static String calculoPeso(double peso){
        //calculo 15%
        double peso15 = peso * 15;
        peso15 = peso15 /100;

        //calculo 20%
        double peso20 = peso * 20;
        peso20 = peso20 / 100;

        return "15% DO SEU PESO É: " + peso15 + " 20% DO SEU PESO É: " + peso20;
    }
    public static void main(String[] args) {
        System.out.println(menu());
    }
}
