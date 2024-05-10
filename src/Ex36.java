import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ex36 {
    /*O jogo de senha é um jogo da web onde você escreverá uma senha como ela diz, mas tem uma diferença: você tem que seguir algumas regras incrivelmente estúpidas para completar a senha perfeita.

    Portanto, neste kata você terá um monte dessas regras idiotas e precisará criar um método que valide se uma String satisfaz todas elas.

    Entrada
    Uma String ou uma String vazia
    A String fornecida não terá espaços em branco ou quebras de linha
    Saída
    Um booleano que indica se a senha é forte o suficiente para passar no jogo
    Regras
    O comprimento máximo da senha é de 50 caracteres ✅
    O comprimento mínimo da senha é de 20 caracteres ✅
    O comprimento da senha deve ser um número primo ✅
    Deve ter pelo menos 1 letra minúscula, 3 letras maiúsculas e 1 caractere especial ✅
    A soma de cada um dos dígitos da senha deve ser de no mínimo 25 ✅
    Deve conter o diminutivo de um mês
    Deve conter a data de hoje
    2 caracteres especiais não podem ficar juntos
    O comprimento da senha deve estar dentro da senha
    Esclarecimentos
    Os meses do ano para este kata são [janeiro, fevereiro, março, abril, maio, junho, julho, agosto, setembro, outubro, novembro, dezembro]
    Os meses podem estar em letras maiúsculas, minúsculas ou combinados
    A data dentro da senha terá o seguinte formato aaaaMMdd
    Os números de data contam como dígitos normais para a adição de todos
    Os caracteres especiais para este kata são [-._@#$&]*/

    private static final char [] caractersEspeciais = {'-', '.', '_', '@', '#', '$', '&'};

    public static void main(String[] args) {

    }

    public static boolean validatePassword(String password){
        //Your code here.
        return false;
    }

    private static boolean validaTamanho(String senha){
        return senha.length() <= 50 && senha.length() >= 20;
    }

    //Ver se não da pra usar recursividade
    private static boolean validaTamanhoPrimo(String senha){
        int num = senha.length();
        if(num > 2){
            for(int i = 2; i < num; i++){
                if(num % i == 0)
                    return false;
            }
        }
        return true;
    }

    private static boolean validaLetras(String senha){
        char [] senhaChars = senha.toCharArray();
        boolean minuscula = false;
        boolean caracterEspecial = false;
        int contMaiusc = 0;

        for (int i = 0; i < senhaChars.length; i++) {
            if(senhaChars[i] == Character.toLowerCase(senhaChars[i])) {
                minuscula = true;
            }

            if(senhaChars[i] == Character.toUpperCase(senhaChars[i])) {
                contMaiusc ++;
            }

            for (int j = 0; j < caractersEspeciais.length; j++) {
                if(senhaChars[i] == caractersEspeciais[i]){
                    caracterEspecial = true;
                    break;
                }
            }
        }

        return minuscula && caracterEspecial && contMaiusc == 3;
    }

    private static boolean validaSomaDigitos(String senha){
        List<Integer> numeros = new ArrayList<>();
        char [] senhaChars = senha.toCharArray();
        for (char senhaChar : senhaChars) {
            if (senhaChar > 47 && senhaChar < 58)
                numeros.add((int) senhaChar);
        }

        Optional<Integer> soma = numeros.stream().reduce(Integer::sum);

        return soma.filter(integer -> integer >= 25).isPresent();
    }
}
