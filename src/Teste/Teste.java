package Teste;

import javax.swing.*;
import java.util.*;

public class Teste implements Sobreposicao{

    final int IDADE = 2;
    static final int IDADE2 = 3;

    public static void main(String[] args) {
        /*JOptionPane.showMessageDialog(null, "Oi");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);*/

        int[] vetor = new int[13];
        int num = IDADE2;
        int vetor2[] = new int[4];

        vetor2[0] = 5;

        System.out.println(vetor2[0]);
    }

    //@Override
    public int metodAbs(int a, int b) {
        int idade = IDADE;
        return a - b;
    }

    public static void teste(ObejectTest test){
        System.out.println("oi");
    }


}
