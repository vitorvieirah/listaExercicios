package Ex22;

import java.util.Scanner;

public abstract class Menus {
    //ideia: fazer um metodo factory


    public static int menuInical(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PARA REALIZAR O CADASTRO DA PESQUISA, DIGITE 1");
        System.out.println("PARA VIZUALIZAR DADOS DE UMA PESQUISA, DIGITE 2");
        System.out.println("PARA ALTERAR DADOS DE UMA PESQUISA, DIGITE 3");
        System.out.println("PARA DELETAR UMA PESQUISA DIGITE 4");
        return sc.nextInt();
    }

    public static void menuCadastro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A QUANTIDADE DE CRIANÇAS NASCIDAS NO PERIODO DA PESQUISA");
        int criancasNascidas = sc.nextInt();
        System.out.println("DIGITE A QUANTIDADE DE CRIANÇAS MORTAS");
        for (int i = 0; i < (sc.nextInt() + criancasNascidas); i++) {
            System.out.println("DIGITE O SEXO DA CRIANÇA E DEPOIS A IDADE DELA (EM MESES)");
            CriancaRepository.addCriancas(Crianca.criar(sc.next(), sc.nextInt()));
        }
        System.out.println("PESQUISA CADASTRADA COM SUCESSO!");
    }

    public static void menuGetPesquisa(){
        
    }


}
