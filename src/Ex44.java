/*
Complete a função power_of_two/ powerOfTwo(ou equivalente, dependendo do seu idioma) que determina se um dado inteiro não negativo é uma potência de dois . Da entrada correspondente da Wikipedia:

uma potência de dois é um número da forma 2 n onde n é um inteiro, ou seja, o resultado da exponenciação com o número dois como base e o inteiro n como expoente.

Você pode assumir que a entrada é sempre válida.

Exemplos
PowerOfTwo.isPowerOfTwo(1024) // -> true
PowerOfTwo.isPowerOfTwo(4096) // -> true
PowerOfTwo.isPowerOfTwo(333)  // -> false
Cuidado com certos casos extremos - por exemplo, 1é uma potência de 2desde 2^0 = 1e 0não é uma potência de 2.
 */


public class Ex44 {
    public static void main(String[] args) {
        boolean result = isPowerOfTwo(32);
        System.out.println(result);
    }


    public static boolean isPowerOfTwo(long n) {
//        boolean naoExpoente = false;
//
//        while (n > 1 && !naoExpoente) {
//            if (n % 2 == 0) {
//                n = n / 2;
//            } else {
//                naoExpoente = true;
//            }
//        }
//
//        if (naoExpoente) {
//            return false;
//        }

        long result = calculoExpoente(n);

        return result == 1;
    }

    private static long calculoExpoente(long exp) {
        if(exp % 2 == 0) {
            calculoExpoente(exp / 2);
        }
        
        return exp;
    }
}
