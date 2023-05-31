import java.util.Scanner;

public class Ex10 {
    //18. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
    // Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
    public static String validarTringulo(int lado1, int lado2, int lado3){
        //triangulo normal:
        if(lado1 + lado2 > lado3){
            return "TRIANGULO PADRAO";
            // triangulo equilátero
        } else if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3){
            return "TRINAGULO EQUILÁTERO";
            // triangulo isóceles
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            return "TRINGAULO ISÓCELES";
            //tringulo escaleno
        }else{
            return "TRIANGULO ESCALENO";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE OS LADOS DO TRIANGULO");
        System.out.println(validarTringulo(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}
