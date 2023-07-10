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

    public static String menuCadastro(){

    }


}
