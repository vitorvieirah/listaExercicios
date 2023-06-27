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
        return calculoHoras(horasInicio, minutosInicio, horasFinal, minutosTermino);
    }


    public static String calculoHoras(int horasInicio, int minutosInicio, int horasFinais, int minutosFinais){
        int hora = 0;
        int minutos =0;
            if(horasInicio == horasFinais){
                hora = 24;
            }
            else if(horasInicio > horasFinais){
                while(horasInicio > horasFinais){
                    if(horasInicio == 23){
                        horasInicio = 0;
                    }
                    horasInicio += 1;
                    hora += 1;
                }
                while (horasInicio <= horasFinais){
                    horasInicio += 1;
                    hora += 1;
                }
            }
                while(horasInicio < horasFinais){
                    if(horasInicio == 23){
                        horasInicio = 0;
                    }
                    horasInicio += 1;
                    hora +=1;
                }
                if(minutosInicio > minutosFinais){
                    while (minutosInicio > minutosFinais){
                        if(minutosInicio == 60){
                            minutosInicio = 0;
                        }
                        minutosInicio += 1;
                        minutos += 1;
                    }
                    while (minutosInicio < minutosFinais){
                        minutosInicio += 1;
                        minutos += 1;
                    }
                }else {
                    while (minutosInicio < minutosFinais) {
                        if (minutosInicio == 60) {
                            minutosInicio = 0;
                        }
                        minutosInicio += 1;
                        minutos += 1;
                    }
                }

        return "HORAS: " + hora + "   MINUTOS: " + minutos;
    }

    public static void main(String[] args) {
        System.out.println(menuInicial());
    }
}
