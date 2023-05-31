package Ex9;

import java.util.Scanner;

public class Ex9 {
    //Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("DIGITE RESPECTIVAMENTE O NOME DO PRODUTO E SEU VALOR:");
            ProdutoArray.produtos[i] = Produto.criar(sc.next(), sc.nextDouble());
        }
    }
    public static void main(String[] args) {
        menu();
        Produto produto = ProdutoArray.comparador();
        System.out.println("O PRODUTO MAIS BARATO É:" + "\n" + produto.getInfo());
    }
}
