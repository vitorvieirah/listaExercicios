package Teste;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
         definirClienteAlteracao(2, 2);
         definirClienteAlteracao(1, 2);
         definirClienteAlteracao(1, null);
    }
    public static void definirClienteAlteracao(Integer num1, Integer num2) {
        if (num1 != num2) {
            System.out.println("São diferentes");
        }else{
            System.out.println("Não são diferentes");
        }
    }




}
