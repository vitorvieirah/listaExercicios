import java.util.*;

public class Ex28 {

   public static char[] strings;
   public static Set<String> stringSet;
   public static int cont;
   public static int contAspasD;
   public static int contAspas;
   public static int contEspa;
   public static int contTra;
   public static String name;

    public static void main(String[] args) {
        String ex = "Jon Stark se promenait avec Arya Stark et Claude \"Evil\" Baratheon. En croisant Jean Targaryen et Christine Frey, " +
                "ils s\'enquirent de l\'état de Bernard Martell, en convalescence chez Francis \"Francis\" Tyrell. Arya Stark et " +
                "Christine Frey repartirent vers Port-Royal tandis que Jean Targaryen resta discuter avec Jon \"Sait-Rien\" Stark.";

        String ex2 = "Vitor Hugo foi a casa de Gustavo \"Gu\" Nakamura e depois se encontrarao com Heitor Gomes e Daniel \"Deni\" Rinaldi.";

        System.out.println("First name: " + getFirstNames(ex2));
        System.out.println("Family name: " + getFamilyNames(ex2));
        System.out.println("Full name: " + getFullNames(ex2));
    }

    private static void setAtribute (){
        strings = null;
        cont = 0;
        contAspasD = 2;
        contAspas = 2;
        contEspa = 0;
        contTra = 0;
        name = "";
        stringSet = new HashSet<>();
    }

    private static void managerMarks(char letra){
        if(letra == '\"'){
            contAspasD --;
            if(contAspasD == 1){
                contEspa --;
            }
        }
        if(letra == '\''){
            contAspas --;
        }
    }

    private static void setMarks(int contA, int contAD){
        if (contA == 0){
            contAspas = 2;
        }
        if (contAD == 0){
            contAspasD = 2;
        }
    }

    private static void managerSpace (int c, int cEspa){
        if(c == 1 && cEspa == 2){
            name = "";
            cont = 0;
            contEspa = 0;
        }
    }

    private static boolean validateAtributeForConcat (int i){
        return (strings[i] != ' ' && contAspasD == 2 && strings[i] != '.' && strings[i] != ',');
    }

    private static void setResult (){
        cont = 0;
        stringSet.add(name);
        name = "";
        contEspa = 0;
    }

    private static void validateCharUpper(int i){
        if (strings[i] == Character.toUpperCase(strings[i]))
            cont++;
    }

    public static Set<String> getFirstNames(String text) {
        setAtribute();
        strings = text.toCharArray();
        for (int i = 0; i < strings.length; i++) {

            managerMarks(strings[i]);

            if(contAspasD == 2){
                managerMarks(strings[i]);
            }

            managerSpace(cont, contEspa);

            if (contAspas == 2 && strings[i] != '-' && validateAtributeForConcat(i)) {
                validateCharUpper(i);
                if (cont == 1) {
                    if (strings[i] != ' ') {
                        name = name.concat(String.valueOf(strings[i]));
                    }
                } else {
                    if(cont == 2 && contTra != 1){
                        setResult();
                    }else {
                        contTra = 0;
                        cont = 0;
                        name = "";
                    }
                }
            }else if (strings[i] == ' ' && cont == 1){
                if(contAspasD != 1){
                    contEspa++;
                }else {
                    contAspasD = 2;
                }
            }else if(strings[i] == '-' && contAspasD != 1){
                contTra++;
            }

            setMarks(contAspas, contAspasD);
        }
        return stringSet;
    }

    public static  Set <String> getFamilyNames(String text) {
        setAtribute();
        strings = text.toCharArray();
        for (int i = 0; i < strings.length; i++) {

            managerMarks(strings[i]);

            if(strings[i] == '-' && contAspasD == 2) {
                contTra++;
            }

            if (i != strings.length - 1 && contAspas == 2 && strings[i] != '-' && validateAtributeForConcat(i)) {
                validateCharUpper(i);
                if (cont == 2 && contTra == 0) {
                    if (strings[i] != ' ') {
                        name = name.concat(String.valueOf(strings[i]));
                    }
                }
            }else {
                if(cont == 1 && strings[i] == ' ' && contAspasD != 0){
                    contEspa ++;
                }


                if(cont == 2) {
                    setResult();
                }
            }

            if(strings[i] == ' ' && contAspasD == 0){
                contAspasD = 2;
            }

            setMarks(contAspas, 1);

            if(cont == 2 && contTra == 1){
                contTra = 0;
                cont = 0;
            }

            managerSpace(cont, contEspa);
        }
        return stringSet;
    }

    public static  Set <String> getFullNames(String text) {
        setAtribute();
        strings = text.toCharArray();

        for (int i = 0; i < strings.length; i++) {

            managerMarks(strings[i]);

            if(validateAtributeForConcat(i) && strings[i] != '\'') {
                validateCharUpper(i);
            }else if (strings[i] == ' ' && cont == 1 && contAspasD == 2){
                contEspa ++;
            }

            if(cont <= 2 && cont >= 1 && contAspasD == 2){
                if((strings[i] == ' ' && cont == 2) || (strings[i] == '.' && cont == 2) || (strings[i] == ',' && cont == 2)){
                    setResult();
                }else if(strings[i] != ','){
                    name = name.concat(String.valueOf(strings[i]));
                }
            }

            if(strings[i] == ' ' && contAspasD == 0){
                contAspasD = 2;
            }

            managerSpace(cont, contEspa);

        }

        return stringSet;
    }
}
