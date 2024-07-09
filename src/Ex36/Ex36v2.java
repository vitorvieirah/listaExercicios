package Ex36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//public class Ex36.Ex36v2 {
//
//    private static final String TODAY_DATE = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
//    private static final char [] caractersEspeciais = {'-', '.', '_', '@', '#', '$', '&'};
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        /*System.out.println("Digite a senha: ");
//        String password = sc.next();*/
//        String password = "pass89$OCT" + TODAY_DATE + "len23";
//        if(validatePassword(password))
//            System.out.println("Senha aprovada");
//        else
//            System.out.println("Senha não aprovada");
//    }
//
//    private static boolean validatePassword(String password) {
//        //"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"
//        String regex = "[a-z]+[A-Z]{3,}[@#\\$&_\\-.]+[jan, JAN, feb, FEB, mar, MAR, apr, APR, may, MAY, jun, JUN, jul, " +
//                "JUL, aug, AUG, sep, SEP, oct, OCT, nov, NOV, dec, DEC]+"+ TODAY_DATE;
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher;
//        if(validaTamanho(password) && validaTamanhoPrimo(password.length()) && validaSomaDigitos(password.toCharArray())
//            && validaCaractersEspeciais(password.length(), password.toCharArray()) && validaTamanhoSenhaDentroDaSenha(password.length(), password.toCharArray())){
//            matcher = pattern.matcher(password);
//            return matcher.find();
//        }else{
//            return false;
//        }
//    }
//
//    private static boolean validaTamanho(String senha){
//        return senha.length() <= 50 && senha.length() >= 20;
//    }
//
//    private static boolean validaTamanhoPrimo(int tamSenha){
//        if(tamSenha > 2){
//            for(int i = 2; i < tamSenha; i++){
//                if(tamSenha % i == 0)
//                    return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean validaSomaDigitos(char[] senhaChars){
//        List<Integer> numeros = new ArrayList<>();
//        for (char senhaChar : senhaChars) {
//            if (senhaChar > 47 && senhaChar < 58)
//                numeros.add(Integer.parseInt(String.valueOf(senhaChar)));
//        }
//
//        Optional<Integer> soma = numeros.stream().reduce(Integer::sum);
//
//        return soma.filter(integer -> integer >= 25).isPresent();
//    }
//
//    private static boolean validaCaracterEspecial(Character c){
//        for(Character chr : caractersEspeciais){
//            if(c == chr)
//                return true;
//        }
//        return false;
//    }
//
//    private static boolean validaCaractersEspeciais(int tamSenha, char[] senhaChars){
//        for (int i = 0; i < tamSenha - 1; i++) {
//            if(validaCaracterEspecial(senhaChars[i])){
//                if(senhaChars[i] == senhaChars[i + 1])
//                    return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean validaTamanhoSenhaDentroDaSenha(int tamSenha, char[] senhaChars){
//        String num = "";
//        int numReal;
//        for (int i = 0; i < tamSenha - 1; i++) {
//            if (senhaChars[i] > 47 && senhaChars[i] < 58){
//                if(senhaChars[i + 1] > 47 && senhaChars[i + 1] < 58){
//                    num = String.valueOf(senhaChars[i]);
//                    num = num.concat(String.valueOf(senhaChars[i + 1]));
//                    numReal = Integer.parseInt(num);
//                    if(numReal == tamSenha)
//                        return true;
//                }
//            }
//        }
//        return false;
//    }
//}

public class Ex36v2 {

    private static final String TODAY_DATE = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    private static final char [] caractersEspeciais = {'-', '.', '_', '@', '#', '$', '&'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Digite a senha: ");
        //String password = sc.next();
        String password = "pass89$OCT" + TODAY_DATE + "len23";
        if (validatePassword(password))
            System.out.println("Senha aprovada");
        else
            System.out.println("Senha não aprovada");
    }

    private static boolean validatePassword(String password) {
        if (validaTamanho(password)
                && validaTamanhoPrimo(password.length())
                && validaSomaDigitos(password)
                && validaCaractersEspeciais(password)
                && validaTamanhoSenhaDentroDaSenha(password)
                && containsMonth(password)
                && password.contains(TODAY_DATE)
                && containsRequiredCharacters(password)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean validaTamanho(String senha){
        return senha.length() <= 50 && senha.length() >= 20;
    }

    private static boolean validaTamanhoPrimo(int tamSenha){
        if (tamSenha <= 1) return false;
        for (int i = 2; i <= Math.sqrt(tamSenha); i++) {
            if (tamSenha % i == 0) return false;
        }
        return true;
    }

    private static boolean validaSomaDigitos(String senha){
        int soma = 0;
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                soma += Character.getNumericValue(c);
            }
        }
        return soma >= 25;
    }

    private static boolean validaCaracterEspecial(char c){
        for (char chr : caractersEspeciais) {
            if (c == chr) return true;
        }
        return false;
    }

    private static boolean validaCaractersEspeciais(String senha){
        for (int i = 0; i < senha.length() - 1; i++) {
            if (validaCaracterEspecial(senha.charAt(i)) && validaCaracterEspecial(senha.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }

    private static boolean validaTamanhoSenhaDentroDaSenha(String senha){
        String senhaStr = String.valueOf(senha.length());
        return senha.contains(senhaStr);
    }

    private static boolean containsMonth(String senha){
        String[] meses = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        for (String mes : meses) {
            if (senha.toLowerCase().contains(mes)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsRequiredCharacters(String senha) {
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int specialCharCount = 0;

        for (char c : senha.toCharArray()) {
            if (Character.isLowerCase(c)) lowerCaseCount++;
            if (Character.isUpperCase(c)) upperCaseCount++;
            if (validaCaracterEspecial(c)) specialCharCount++;
        }

        return lowerCaseCount >= 1 && upperCaseCount >= 3 && specialCharCount >= 1;
    }
}
