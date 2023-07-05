public class Ex20 {
    //20) Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
    //três e que se encontram no conjunto dos números de 1 até 500.
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i < 501; i++) {
            if(i % 3 == 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
