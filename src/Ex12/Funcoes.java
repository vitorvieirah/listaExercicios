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
        if(valor > 600){
            System.out.println("O VALOR MAXIMO É 600");
            System.exit(0);
        }
         int unidade = unidade(valor);
         int dezena = dezena(valor);
         int centena = centena(valor);
         return validacaoNotas(centena, dezena, unidade);
    }
    public static int unidade(int valor){
        return valor = valor - ((valor / 10)*10);
    }
    public static int dezena(int valor){
        return valor = (((valor / 100)*10) - valor / 10)*-1;
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
        if (dezena < 5){
            nota10 = dezena;
        }
        if(unidade >=5){
            nota5 = 1;
            if(unidade == 6){
                nota1 = 1;
            }else if(unidade == 7){
                nota1 = 2;
            }else if(unidade == 8){
                nota1 = 3;
            }else if(unidade == 9){
                nota1 = 4;
            }
        }else if (unidade < 5){
            if(unidade == 4){
                nota1 = 4;
            }else if(unidade == 3){
                nota1 = 3;
            }else if (unidade == 2){
                nota1 = 2;
            }else if (unidade == 1){
                nota1 = 1;
            }
        }
        return "NOTAS DE 100: " + nota100 + " " + "NOTAS DE 50: " + nota50 + " " + "NOTAS DE 10: " + nota10
                + " " + "NOTAS DE 5: " + nota5 + " " + "NOTAS DE 1: " + nota1;
    }
}