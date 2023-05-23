import java.util.ArrayList;

public class Ex8 {
    //calcular variancia de uma lista de valores
    public static void main(String[] args) {
        double[] tabelaA = new double[20];
        tabelaA[0] = 18.2;
        tabelaA[1] = 19.4;
        tabelaA[2] = 20.1;
        tabelaA[3] = 21.7;
        tabelaA[4] = 22.3;
        tabelaA[5] = 18.6;
        tabelaA[6] = 19.7;
        tabelaA[7] = 20.8;
        tabelaA[8] = 21.8;
        tabelaA[9] = 22.8;
        tabelaA[10] = 18.8;
        tabelaA[11] = 19.7;
        tabelaA[12] = 21;
        tabelaA[13] = 21.9;
        tabelaA[14] = 22.8;
        tabelaA[15] = 18.9;
        tabelaA[16] = 19.7;
        tabelaA[17] = 21.5;
        tabelaA[18] = 21.9;
        tabelaA[19] = 23.5;
        double aux = 0;
        double media = 20.26;
        double resultado = 0;
        for (int i = 0; i < tabelaA.length; i++) {
            aux = tabelaA[i] - media;
        }
        resultado = (aux*aux)/20;
        System.out.println(resultado);
    }
}
