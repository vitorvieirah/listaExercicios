package Ex12;

import java.util.Scanner;

public class Ex14 {
    //28. Escrever um algoritmo que lê a hora de início e hora de término de um jogo, ambas subdivididas em dois valores distintos : horas e minutos.
    // Calcular e escrever a duração do jogo, também em horas e minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas
    // e que o jogo pode iniciar em um dia e terminar no dia seguinte.

    public static String menuInicial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE AS HORAS DO INICIO: ");
        int horasInicio = sc.nextInt();
        System.out.println("DIGITE OS MINUTOS DE INICIO:");
        int minutosInicio = sc.nextInt();
        System.out.println("DIGITE AS HORAS DO TÉRMINO: ");
        int horasFinal = sc.nextInt();
        System.out.println("DIGITE OS MINUTOS DO TÉRMINO:");
        int minutosTermino = sc.nextInt();


    }


    public static String calculoHoras(int horasInicio, int minutosInicio, int horasFinais, int minutosFinais){
        if(horasInicio < 12){
            switch (horasInicio){
                case 13 : horasInicio = 1;
                break;
                case 14: horasInicio = 2;
                break;
                case 15: horasInicio = 3;
                break;
                case 16: horasInicio = 4;
                break;
                case 17: horasInicio = 5;
                break;
                case 18: horasInicio = 6;
                break;
                case 19 : horasInicio = 7;
                break;
                case 20 : horasInicio = 8;
                break;
                case 21 : horasInicio = 9;
                break;
                case 22: horasInicio = 10;
                break;
                case 23 : horasInicio = 11;
                break;
                case 00 : horasInicio = 12;
                break;
            }
        }
    }



    public static void main(String[] args) {

    }
}
