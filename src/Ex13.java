import java.util.Scanner;
import java.time.LocalDate;

public class Ex13 {
    //3. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

    public static String menuInicial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A SUA IDADE DA SEQUINTE FORMA: ANOS, MESES, DIAS");
            int anos = sc.nextInt();
            int meses = sc.nextInt();
            int dias = sc.nextInt();
            return calculoIdadeDias(anos, meses, dias);
    }

    public static String calculoIdadeDias(int anos, int meses, int dias){
        int diasTotais = anos * 365;
        diasTotais += meses * 30;
        diasTotais += dias;
        return "OS DIAS TOTAIS SÃO: " + diasTotais;
    }

    public static void main(String[] args) {
        System.out.println(menuInicial());
    }
}
