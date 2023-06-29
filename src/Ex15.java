import javax.sql.rowset.serial.SerialStruct;
import java.util.Scanner;

public class Ex15 {
    //15 Faça um algoritmo que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

    public static String menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O TEMPO EM SEGUNDOS:");
        return calculoTempo(sc.nextInt());
    }

    public static String calculoTempo(int tempo){
        int minutos = tempo / 60;
        int hora = minutos;

        if(minutos >= 60){
            
        }



        return "HORAS: " + hora + "  MINUTOS: " + minutos + "  SEGUNDOS:  " + tempo;
    }





    public static void main(String[] args) {

    }
}
