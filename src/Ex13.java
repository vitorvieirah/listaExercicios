import java.util.Scanner;
import java.time.LocalDate;

public class Ex13 {
    //3. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

    public static int menuInicial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A SUA IDADE DA SEQUINTE FORMA: ANOS, MESES. DIAS");
            int anos = sc.nextInt();
            int meses = sc.nextInt();
            int dias = sc.nextInt();
            return anos + meses + dias;
    }

    public static String calculoIdadeDias(int anos, int meses, int dias){
        int diasTotais = anos * 365;

    }

    public static int validaMes(int meses){
        LocalDate dataAtual = LocalDate.now();
        //int ano = dataAtual.getYear();
        int mes = dataAtual.getMonthValue();
        //int dia = dataAtual.getDayOfMonth();
        int[] mesvalidacao = new int[12];
        mesvalidacao[0] = 1;
        mesvalidacao[1] = 2;
        mesvalidacao[2] = 3;
        mesvalidacao[3] = 4;
        mesvalidacao[4] = 5;
        mesvalidacao[5] = 6;
        mesvalidacao[6] = 7;
        mesvalidacao[7] = 8;
        mesvalidacao[8] = 9;
        mesvalidacao[9] = 10;
        mesvalidacao[10] = 11;
        mesvalidacao[11] = 12;
        for (int i = mes - 1; i < meses; i ++){

        }
    }
    public static void main(String[] args) {

    }
}
