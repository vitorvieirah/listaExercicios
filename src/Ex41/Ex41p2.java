package Ex41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex41p2 {

    private static final int[][] matriz = new int[4][3];
    public static List<String> getPINs(String observed) {
        int tamSenha = observed.length();
        char[] chars = observed.toCharArray();
        List<Endereco> outros = new ArrayList<>();
        List<Endereco> enderecos = new ArrayList<>();
        List<Combinacao> combinacoes = new ArrayList<>();
        //List<String> result = new ArrayList<>();

        //preenche matriz
        int value = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 3)
                    matriz[i][j] = 0;
                else {
                    matriz[i][j] = value;
                    value++;
                }
            }
        }

        //Procura endereços dos valores na matriz
        for (int i = 0; i < 2; i++) {
            int valor = Integer.parseInt(String.valueOf(chars[i]));
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (matriz[j][k] == valor) {
                        enderecos.add(new Endereco(j, k));
                    } else if (valor == 0) {
                        enderecos.add(new Endereco(3, 1));
                    }
                }
            }
        }

        //Traz todas os outros endereços possíveis de combinações
        enderecos.forEach(end -> {
            switch (end.getLinha()) {
                case 0 -> {
                    if (end.getColuna() != 0) {
                        outros.add(new Endereco(end.getLinha(), end.getColuna() - 1));
                        //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha(), end.getColuna() - 1), end)));
                    }

                    if (end.getColuna() != 2) {
                        outros.add(new Endereco(end.getLinha(), end.getColuna() + 1));
                        //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha(), end.getColuna() + 1), end)));
                    }

                    outros.add(new Endereco(end.getLinha() + 1, end.getColuna()));
                    //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha() + 1, end.getColuna()), end)));
                }
                case 1 -> {
                    if (end.getColuna() != 0) {
                        outros.add(new Endereco(end.getLinha(), end.getColuna() - 1));
                        //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha(), end.getColuna() - 1), end)));
                    }
                    if (end.getColuna() != 2) {
                        outros.add(new Endereco(end.getLinha(), end.getColuna() - 1));
                        //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha(), end.getColuna() + 1), end)));
                    }

                    outros.add(new Endereco(end.getLinha() + 1, end.getColuna()));
                    //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha() + 1, end.getColuna()), end)));
                    outros.add(new Endereco(end.getLinha() - 1, end.getColuna()));
                    //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha() - 1, end.getColuna()), end)));
                }
                case 2 -> {
                    if (end.getColuna() != 0) {
                        outros.add(new Endereco(end.getLinha(), end.getColuna() - 1));
                        //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha(), end.getColuna() - 1), end)));
                    }
                    if (end.getColuna() != 2){
                        outros.add(new Endereco(end.getLinha(), end.getColuna() - 1));
                        //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha(), end.getColuna() + 1), end)));
                    }

                    outros.add(new Endereco(end.getLinha() - 1, end.getColuna()));
                    //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha() - 1, end.getColuna()), end)));
                }
                default -> {
                    outros.add(new Endereco(end.getLinha() - 1, end.getColuna()));
                    //combinacoes.add(new Combinacao(List.of(new Endereco(end.getLinha() - 1, end.getColuna()), end)));

                }
            }
        });


        outros.addAll(enderecos);

        int valor;
        StringBuilder result = new StringBuilder();

        for(Endereco end : enderecos) {
            valor = matriz[end.getLinha()][end.getColuna()];
            for (int i = 0; i < outros.size(); i++) {
                result.append(valor);
                for (int j = i; j < i + tamSenha; j++) {
                    if(outros.get(j) != end)
                        result.append(outros.get(j));
                    else
                        result.append(outros.get(j + 1));
                }
            }
        }






//        switch (tamSenha){
//            case 1 -> {
//                Endereco end = enderecos.getFirst();
//                result.add(String.valueOf(matriz[end.getLinha()][end.getColuna()]));
//                outros.forEach(endO -> result.add(String.valueOf(matriz[endO.getLinha()][endO.getColuna()])));
//            }
//            case 2 ->{
//                enderecos.forEach(endE -> {
//                    String endER = String.valueOf(matriz[endE.getLinha()][endE.getColuna()]);
//                    outros.forEach(endO -> result.add(endER + matriz[endE.getLinha()][endO.getColuna()]));
//                });
//            }
//
//
//
//
//        }

        return null;
    }
}
