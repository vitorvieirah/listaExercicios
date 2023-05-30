import javax.sound.sampled.Port;

public class ProdutoArray {
    static Produto[] produtos = new Produto[3];
    public static Produto comparador(){
        Produto produtoCerto = null;
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i].getValor() < produtos[i + 1].getValor()){
                produtoCerto = produtos[i];
            }
        }
        return produtoCerto;
    }
}
