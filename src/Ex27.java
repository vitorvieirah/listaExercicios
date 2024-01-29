public class Ex27 {
    public static void main(String[] args) {
        System.out.println(numeros(new int[]{78,56,232,12,11,43}));
    }

    public static int numeros (int[] numbers){
        int menor = numbers[0];
        for(int i : numbers){
            if(i < menor){
                menor = i;
            }
        }
        return menor;
    }

    public static int somaQuadratica(int[] n){
        int soma = 0;

        for(int i : n){
            soma += i * i;
        }
        return soma;
    }
}
