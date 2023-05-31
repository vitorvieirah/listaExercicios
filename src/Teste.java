import Ex9.Produto;

public class Teste {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];
        Produto produto1 = null;
        Produto produto2 = null;
        produtos[0] = produto1;
        produtos[1] = produto2;

        for(int i = 0; i < produtos.length; i ++){
            System.out.println(produtos[i + 1]);
        }

    }
}
