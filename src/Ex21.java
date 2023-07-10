import java.util.Scanner;

public class Ex21 {
    //21) Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
    //    //Dada a massa inicial, em gramas, fazer um algoritmo que determine o tempo necessário para que
    //essa massa se torne menor do que 0,5 grama. Escreva a massa inicial, a massa final e o tempo
    //calculado em horas, minutos e segundos.


    public static String menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A MASSA A SER ANALISADA: ");
        return calculoMassa(sc.nextDouble());
    }

    public static String calculoMassa(double massa){
        double massaInical = massa;
        int tempo = 0;
        int minutos = 0;
        while (massa > 0.5){
            tempo += 1;
            if(tempo == 50){
                massa = massa / 2;
            }
            if(tempo == 60){
                tempo = 0;
                minutos += 1;
            }
        }
        int horas = minutos / 60;

        return "MASSA INICIAL: " + massaInical + " MASSA FINAL: " + massa + " TEMPO: HORAS: " + horas + " MINUTOS: " +  minutos + " SEGUNDOS: " + tempo;
    }
    public static void main(String[] args) {
        System.out.println(menu());
    }
}
