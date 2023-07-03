import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex18 {
 //18. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e
 //mostre:
 //a) a idade dessa pessoa em anos;
 //b) a idade dessa pessoa em meses;
 //c) a idade dessa pessoa em dias;
 //d) a idade dessa pessoa em semanas.

    public static String menu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("POR FAVOR DIGITE A SUA DATA DE NASCIMENTO NA SEQUINTE ORDEM: DIA, MES, ANO ");
        return calculoAnos(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
    public static String calculoAnos(int dia, int mes, int ano){
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataUsuario = LocalDate.of(ano, mes, dia);
        Period diferenca = dataAtual.until(dataUsuario);
        int anos = -1 *(diferenca.getYears());
        int meses = anos * 12;
        int dias = meses * 30;
        int semanas = meses * 4;
        return "SUA IDADE EM: ANOS: " + anos + " MESES: " + meses + " DIAS: " + dias + " SEMANAS: " + semanas;
    }
    public static void main(String[] args) {
        System.out.println(menu());
    }
}
