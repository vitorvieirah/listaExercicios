import java.util.Random;
import java.util.Scanner;

public class Ex16 {
    //16) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
    //jogador vai tentar descobrir qual foi o valor sorteado.

    public static String menuInicial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO QUE ACREDITA QUE SERÁ SORTEADO:");
        return sorteio(sc.nextInt());
    }

    public static String sorteio(int numero){
        Random random = new Random();
        int numSorteio = random.nextInt(5);
        if(numero == numSorteio){
            return "PARABENS, VOCCÊ ACERTOU | O NUMERO SORTEADO FOI: "  + numSorteio;
        }else {
            return "INFELIZMENTE VOCÊ NAO ACERTOU O NUMERO SORTEADO | O NUMERO SORTEADO FOI: " + numSorteio;
        }
    }

    public static void main(String[] args) {
        System.out.println(menuInicial());
    }
}
