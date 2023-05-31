package Ex9;

import Ex9.Produto;

public class ProdutoArray {
    static Produto[] produtos = new Produto[3];
    public static Produto comparador(){
        Produto produtoCerto = null;
        for(int i = 0; i < produtos.length; i++){
            produtoCerto = produtos[0];
            if(produtos[i].getValor() < produtoCerto.getValor()){
                produtoCerto = produtos[i];
            }
        }
        return produtoCerto;
    }
}
