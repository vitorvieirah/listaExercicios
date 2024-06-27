import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    private static final char [] caractersEspeciais = {'-', '.', '_', '@', '#', '$', '&'};
    private static final String TODAY_DATE = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    private static String senha;
    private static char[] senhaChars;
    private static Integer tamSenha;

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

    public static boolean validatePassword(String password){
        senha = password;
        senhaChars = senha.toCharArray();
        tamSenha = senhaChars.length;
        return validaTamanho() && validaTamanhoPrimo() && validaLetras() && validaSomaDigitos()
            && validaMeses() && validaDataHoje() && validaCaractersEspeciais() && validaTamanhoSenhaDentroDaSenha();
    }

    private static boolean validaTamanho(){
        return senha.length() <= 50 && senha.length() >= 20;
    }

    private static boolean validaTamanhoPrimo(){
        if(tamSenha > 2){
            for(int i = 2; i < tamSenha; i++){
                if(tamSenha % i == 0)
                    return false;
            }
        }
        return true;
    }

    private static boolean validaLetras(){
        boolean minuscula = false;
        boolean caracterEspecial = false;
        int contMaiusc = 0;
        int contEsp = 0;

        for (int i = 0; i < tamSenha; i++) {
            if(!validaIsNumero(senhaChars[i])){
                for (char caractersEspeciai : caractersEspeciais) {
                    if (senhaChars[i] == caractersEspeciai) {
                        caracterEspecial = true;
                        contEsp++;
                        break;
                    }
                }
            }

            if(!validaIsNumero(senhaChars[i]) && senhaChars[i] == Character.toLowerCase(senhaChars[i]) && contEsp != 1) {
                minuscula = true;
            }

            if(!validaIsNumero(senhaChars[i]) && senhaChars[i] == Character.toUpperCase(senhaChars[i]) && contEsp != 1) {
                contMaiusc ++;
            }

            contEsp = 0;
        }

        return minuscula && caracterEspecial && contMaiusc == 3;
    }

    private static boolean validaSomaDigitos(){
        List<Integer> numeros = new ArrayList<>();
        for (char senhaChar : senhaChars) {
            if (senhaChar > 47 && senhaChar < 58)
                numeros.add(Integer.parseInt(String.valueOf(senhaChar)));
        }

        Optional<Integer> soma = numeros.stream().reduce(Integer::sum);

        return soma.filter(integer -> integer >= 25).isPresent();
    }

    private static boolean validaMeses(){
        char[] siglaMes = new char[3];
        boolean aprovado;

        for (int i = 0; i < tamSenha; i++) {
            aprovado = false;
            for (int j = 0; j < 3; j++) {
                if(!validaIsNumero(senhaChars[j+i]) && !validaCaracterEspecial(senhaChars[j+i]))
                    siglaMes[j] = senhaChars[j + i];
                else{
                    aprovado = true;
                    break;
                }
            }
            if(!aprovado){
                if(validaSiglaMes(siglaMes))
                    return true;
            }
        }
        return false;
    }

    private static boolean validaDataHoje(){
        String data = "";
        char[] siglaData = new char[8];
        for (int i = 0; i < tamSenha - 8; i++) {
            for (int j = 0; j < 8; j++) {
                 siglaData[j] = senhaChars[i + j];
            }

            for(Character c : siglaData)
                data = data.concat(String.valueOf(c));



            if(data.equals(TODAY_DATE))
                return true;
        }
        return false;
    }

    private static boolean validaCaractersEspeciais(){
        for (int i = 0; i < tamSenha - 1; i++) {
            if(validaCaracterEspecial(senhaChars[i])){
                if(senhaChars[i] == senhaChars[i + 1])
                    return false;
            }
        }
        return true;
    }

    private static boolean validaTamanhoSenhaDentroDaSenha(){
        String num = "";
        int numReal;
        for (int i = 0; i < tamSenha - 1; i++) {
            if (senhaChars[i] > 47 && senhaChars[i] < 58){
                if(senhaChars[i + 1] > 47 && senhaChars[i + 1] < 58){
                    num = String.valueOf(senhaChars[i]);
                    num = num.concat(String.valueOf(senhaChars[i + 1]));
                    numReal = Integer.parseInt(num);
                    if(numReal == tamSenha)
                        return true;
                }
            }
        }
        return false;
    }

    private static boolean validaSiglaMes(char[] sigla){
        String siglaString = "";
        for(Character c : sigla)
            siglaString = siglaString.concat(String.valueOf(c)).toLowerCase();

        return switch (siglaString) {
            case "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" -> true;
            default -> false;
        };
    }

    private static boolean validaCaracterEspecial(Character c){
        for(Character chr : caractersEspeciais){
            if(c == chr)
                return true;
        }
        return false;
    }

    private static boolean validaIsNumero(char letra){
        return letra > 47 && letra < 58;
    }
}
