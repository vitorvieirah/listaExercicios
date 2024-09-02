package org.example;

import java.util.Random;

public class GeradorDeSenhas {

    private char[] alfabeto = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'v'};
    //!@#$%^&*()-_=+[]{}|;:',.<>?/
    private char[] caractersEspeciais = new char[]{'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+',
            '[', ']', '{', '}', '|', ';', ':', '\'', ',', '.', '<', '>', '?', '\\'};
    private Random random = new Random();

    public String gerarSenha(int tamanho, boolean minusculas, boolean maiusculas, boolean numeros, boolean caracteresEspeciais) {
        int newTamanho;
        boolean tamanhoIsPar;
        String senha = "";

        tamanhoIsPar = tamanho % 2 == 0;

        if(!minusculas && !maiusculas && !numeros && !caracteresEspeciais) {
            System.out.println("Nenhuma das opções foram escolhidas");
            System.exit(0);
        }

        if(minusculas && !maiusculas && !numeros && !caracteresEspeciais){
            for (int i = 0; i < tamanho; i++)
                senha = senha.concat(gerarMinuscula());
        }

        if(!minusculas && maiusculas && !numeros && !caracteresEspeciais){
            for (int i = 0; i < tamanho; i++)
                senha = senha.concat(gerarMaiuscula());
        }

        if(!minusculas && !maiusculas && numeros && !caracteresEspeciais){
            for (int i = 0; i < tamanho; i++)
                senha = senha.concat(geraraNumero());
        }

        if(!minusculas && !maiusculas && !numeros && caracteresEspeciais){
            for (int i = 0; i < tamanho; i++)
                senha = senha.concat(gerarCaracterEspecial());
        }

        if(minusculas && maiusculas && !numeros && !caracteresEspeciais){
            newTamanho = tamanho / 2;

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(gerarMinuscula());
            }

            if(!tamanhoIsPar){
                newTamanho = tamanho - newTamanho;
            }

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(gerarMaiuscula());
            }
        }

        if(minusculas && maiusculas && numeros && !caracteresEspeciais){
            newTamanho = tamanho / 3;

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(gerarMinuscula());
                senha = senha.concat(gerarMaiuscula());
            }

            if(tamanhoIsPar){
                newTamanho = tamanho - (newTamanho * 2);
            }

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(geraraNumero());
            }
        }

        if(minusculas && maiusculas && numeros && caracteresEspeciais){
            newTamanho = tamanho / 4;

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(gerarMinuscula());
                senha = senha.concat(gerarMaiuscula());
                senha = senha.concat(geraraNumero());
            }

            if(!tamanhoIsPar){
                newTamanho = tamanho - (newTamanho * 3);
            }

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(gerarCaracterEspecial());
            }
        }

        if(!minusculas && maiusculas && numeros && caracteresEspeciais){
            newTamanho = tamanho / 3;

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(gerarMaiuscula());
                senha = senha.concat(geraraNumero());
            }

            if(tamanhoIsPar){
                newTamanho = tamanho - (newTamanho * 2);
            }

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(gerarCaracterEspecial());
            }
        }

        if(!minusculas && !maiusculas && numeros && caracteresEspeciais){
            newTamanho = tamanho / 2;

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(geraraNumero());
            }

            if(!tamanhoIsPar){
                newTamanho = tamanho - newTamanho;
            }

            for (int i = 0; i < newTamanho; i++) {
                senha = senha.concat(gerarCaracterEspecial());
            }
        }

        return senha;
    }

    private String gerarMinuscula() {
        return String.valueOf(alfabeto[random.nextInt(26)]);
    }

    private String gerarMaiuscula() {
        return String.valueOf(alfabeto[random.nextInt(26)]).toUpperCase();
    }

    private String geraraNumero() {
        return String.valueOf(random.nextInt(9));
    }

    private String gerarCaracterEspecial() {
        return String.valueOf(caractersEspeciais[random.nextInt(28)]);
    }
}