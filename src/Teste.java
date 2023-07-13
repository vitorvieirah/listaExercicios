import Ex9.Produto;

public class Teste {
    public static void main(String[] args) {
        String valida = "não";
        boolean viva = true;
        if(valida.equalsIgnoreCase("não")){
            viva  = false;
        }
        System.out.println(viva);
    }
}
