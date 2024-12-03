/*
Escreva uma função para converter um nome em iniciais. Este kata pega estritamente duas palavras com um espaço entre elas.

A saída deve ser duas letras maiúsculas com um ponto separando-as.

Deve ficar assim:

Sam Harris=>S.H

patrick feeney=>P.F
*/


public class Ex43 {
    public static String abbrevName(String name) {
        StringBuilder nameBuilder = new StringBuilder(name);
        String nameAbbrev = String.valueOf(nameBuilder.charAt(0)).toUpperCase();
        nameAbbrev = nameAbbrev.concat(".")




        return name;
    }
}
