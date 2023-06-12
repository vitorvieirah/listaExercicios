package Ex12;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public abstract class Funcoes {
    public static int menuInicial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O VALOR QUE DESEJA SACAR:");
        return sc.nextInt();
    }

    public static String  caixaEletronico(int valor){
         int unidade = unidade(valor);
         int dezena = dezena(valor);
         int centena = centena(valor);
         return
    }
    public static int unidade(int valor){
        return valor = ((valor / 10)*10) - valor;
    }
    public static int dezena(int valor){
        return valor = ((valor / 100)*10) - valor / 10;
    }
    public static int centena(int valor){
        return valor = valor/100;
    }
    public static String validacaoNotas(int centena, int dezena, int unidade){
        int nota1 = 0;
        int nota5 = 0;
        int nota10 = 0;
        int nota50 = 0;
        int nota100 = 0;
        nota100 = centena;
        //valida dezena
        if (dezena >= 5){
            nota50 = 1;
            if(dezena == 6){
                nota10 = 1;
            }else if (dezena == 7){
                nota10 = 2;
            } else if (dezena == 8){
                nota10 = 3;
            }else if (dezena == 9){
                nota10 = 4;
            }
        }
    }
}