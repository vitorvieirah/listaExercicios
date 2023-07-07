import java.util.Scanner;

public class Ex21 {
    //21) Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
    //Dada a massa inicial, em gramas, fazer um algoritmo que determine o tempo necessário para que
    //essa massa se torne menor do que 0,5 grama. Escreva a massa inicial, a massa final e o tempo
    //calculado em horas, minutos e segundos.


    public static String menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A MASSA A SER ANALISADA: ");
        return calculoMassa(sc.nextDouble());
    }

    public static String calculoMassa(double massa){
        double massaFinal = 0;
        int tempo = 0;
        while (massa > 0.5){
            tempo += 1;
            int tempo2 = 0;
            if(tempo == 50){
                tempo = 0;
                tempo2 += 1;
                double metade = massa / 2;
                massaFinal = massa - metade;
            }
        }
        int minutos = tempo / 60;
        int segundos =  (minutos * 60) - tempo;
        int horas = minutos / 60;
        minutos = minutos - 60;

        return "MASSA INICIAL: " + massa + " MASSA FINAL: " + massaFinal + " TEMPO: HORAS: " + horas + " MINUTOS: " +  minutos + " SEGUNDOS: " + segundos;
    }
    public static void main(String[] args) {
        System.out.println(menu());
    }
}
