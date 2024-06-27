import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex36v2 {
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
    Deve conter o diminutivo de um mês ✅
    Deve conter a data de hoje ✅
    2 caracteres especiais não podem ficar juntos ✅
    O comprimento da senha deve estar dentro da senha ✅
    Esclarecimentos
    Os meses do ano para este kata são [janeiro, fevereiro, março, abril, maio, junho, julho, agosto, setembro, outubro, novembro, dezembro]
    Os meses podem estar em letras maiúsculas, minúsculas ou combinados
    A data dentro da senha terá o seguinte formato aaaaMMdd
    Os números de data contam como dígitos normais para a adição de todos
    Os caracteres especiais para este kata são [-._@#$&]

    Problemas
    - O numero é considerado minusculo e maisculo, arrumar isso.

    */

    private static final String TODAY_DATE = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Digite a senha: ");
        String password = sc.next();*/
        String password = "pass89$OCT" + TODAY_DATE + "len23";
        if(validatePassword(password))
            System.out.println("Senha aprovada");
        else
            System.out.println("Senha não aprovada");
    }

    private static boolean validatePassword(String password) {
        String regex = "[a-z]+[A-Z]{3,}[@#\\$&_\\-.]+";
        Pattern pattern = Pattern.compile("");
        if(validaTamanho(password) && validaTamanhoPrimo(password.length()) && validaSomaDigitos(password.toCharArray())){

        }else{
            System.out.println("Tamanho da senha incorreto");
        }


    }

    private static boolean validaTamanho(String senha){
        return senha.length() <= 50 && senha.length() >= 20;
    }

    private static boolean validaTamanhoPrimo(int tamSenha){
        if(tamSenha > 2){
            for(int i = 2; i < tamSenha; i++){
                if(tamSenha % i == 0)
                    return false;
            }
        }
        return true;
    }

    private static boolean validaSomaDigitos(char[] senhaChars){
        List<Integer> numeros = new ArrayList<>();
        for (char senhaChar : senhaChars) {
            if (senhaChar > 47 && senhaChar < 58)
                numeros.add(Integer.parseInt(String.valueOf(senhaChar)));
        }

        Optional<Integer> soma = numeros.stream().reduce(Integer::sum);

        return soma.filter(integer -> integer >= 25).isPresent();
    }
}
