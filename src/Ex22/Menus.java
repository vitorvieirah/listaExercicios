package Ex22;
import java.util.Scanner;

public abstract class Menus {
    //ideia: fazer um metodo factory


    public static int menuInical(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PARA REALIZAR O CADASTRO DA PESQUISA, DIGITE 1");
        System.out.println("PARA VIZUALIZAR DADOS DA PESQUISA, DIGITE 2");
        System.out.println("PARA ALTERAR DADOS DA PESQUISA, DIGITE 3");
        System.out.println("PARA DELETAR A PESQUISA DIGITE 4");
        return sc.nextInt();
    }

    public static void menuCadastro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A QUANTIDADE DE CRIANÇAS NASCIDAS NO PERIODO DA PESQUISA");
        for (int i = 0; i < sc.nextInt(); i++) {
            System.out.println("DIGITE O SEXO DA CRIANÇA, A IDADE DELA (EM MESES), E SE ELA ESTA VIVA OU NÃO (SIM OU NÃO)");
            String sexo = sc.next();
            int idade = sc.nextInt();
            String valida = sc.next();
            boolean viva = true;
            if(valida.equalsIgnoreCase("nao")){
                viva  = false;
            }
            CriancaRepository.addCriancas(Crianca.criar(sexo, idade, viva));
        }
        System.out.println("PESQUISA CADASTRADA COM SUCESSO!");
    }

    public static String menuGetPesquisa(){
        return "A) PORCENTAGEM DE CRIANÇAS MORTAS: " + CriancaRepository.getPorcentagemMortas() + "%  " + "\n" +
                "B) PORCENTAGEM DE CRIANÇAS MASCULINAS MORTAS: " + CriancaRepository.getPorcetagemMasculino() + "%" + "\n" +
                "C) PORCETAGEM DE CRIANÇAS ATÉ 24 MESES DE VIDA: " + CriancaRepository.getCriancasIdade() + "%";
    }


}
