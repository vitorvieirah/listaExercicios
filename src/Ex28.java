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

        String ex2 = "Claude \"Evil\" Baratheon. En croisant Jean Targaryen et Christine Frey,";
        String ex3 = "ils s\'enquirent de l\'état de Bernard Martell, en convalescence chez Francis \"Francis\" Tyrell. Arya Stark et";
        String ex4 = "Christine Frey repartirent vers Port-Royal tandis que Jean Targaryen resta discuter avec Jon \"Sait-Rien\" Stark.";
        String ex5 = "Francis \"Francis\" Tyrell. Arya Stark et";
        String ex6 = "Jean Targaryen et Christine Frey,";

        System.out.println("First name: " + getFirstNames(ex));
        System.out.println("Family name: " + getFamilyNames(ex));
        System.out.println("Full name: " + getFullNames(ex));
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

    public static Set<String> getFirstNames(String text) {
        setAtribute();
        strings = text.toCharArray();
        for (int i = 0; i < strings.length; i++) {

            if(strings[i] == '\"' && contAspasD == 2){
                contAspasD --;
            }

            if(strings[i] == '\''){
                contAspas --;
            }

            if(cont == 1 && contEspa == 2){
                name = "";
                cont = 0;
                contEspa = 0;
            }

            if (strings[i] != ' ' && contAspasD == 2 && contAspas == 2 && strings[i] != '-' && strings[i] != '.' && strings[i] != ',') {
                if (strings[i] == Character.toUpperCase(strings[i])) {
                    cont++;
                }
                if (cont == 1) {
                    if (strings[i] != ' ') {
                        name = name.concat(String.valueOf(strings[i]));
                    }
                } else {
                    if(cont == 2 && contTra != 1){
                        cont = 0;
                        stringSet.add(name);
                        name = "";
                        contEspa = 0;
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


            if(contAspasD == 0){
                contAspasD = 2;
            }

            if(contAspas == 0){
                contAspas = 2;
            }
        }
        return stringSet;
    }

    public static  Set <String> getFamilyNames(String text) {
        setAtribute();
        strings = text.toCharArray();
        for (int i = 0; i < strings.length; i++) {

            if(strings[i] == '\"'){
                contAspasD --;
            }

            if(strings[i] == '\''){
                contAspas --;
            }

            if(strings[i] == '-' && contAspasD == 2) {
                contTra++;
            }

            if (strings[i] != ' ' && i != strings.length - 1 && contAspasD == 2 && contAspas == 2 && strings[i] != '.' && strings[i] != '-' && strings[i] != ',') {
                if (strings[i] == Character.toUpperCase(strings[i])) {
                    cont++;
                }
                if (cont == 2 && contTra == 0) {
                    if (strings[i] != ' ') {
                        name = name.concat(String.valueOf(strings[i]));
                    }
                }
            }else {
                if(cont == 1 && strings[i] == ' ' && contAspasD != 0){
                    contEspa ++;
                }


                if(cont == 2){
                    cont = 0;
                    contEspa = 0;
                    stringSet.add(name);
                    name = "";
                }
            }

            if(strings[i] == ' ' && contAspasD == 0){
                contAspasD = 2;
            }

            if(contAspas == 0){
                contAspas = 2;
            }

            if(cont == 2 && contTra == 1){
                contTra = 0;
                cont = 0;
            }

            if(cont == 1 && contEspa == 2){
                cont =  0;
                contEspa = 0;
            }
        }
        return stringSet;
    }

    public static  Set <String> getFullNames(String text) {
        setAtribute();
        strings = text.toCharArray();

        for (int i = 0; i < strings.length; i++) {

            if(strings[i] == '\"'){
                contAspasD --;
            }


            if(strings[i] != ' ' && strings[i] != '.' && contAspasD == 2 && strings[i] != ',' && strings[i] != '\'') {
                if (strings[i] == Character.toUpperCase(strings[i])) {
                    cont++;
                }
            }else if (strings[i] == ' ' && cont == 1 && contAspasD == 2){
                contEspa ++;
            }

            if(cont <= 2 && cont >= 1 && contAspasD == 2){
                if((strings[i] == ' ' && cont == 2) || (strings[i] == '.' && cont == 2) || (strings[i] == ',' && cont == 2)){
                    cont = 0;
                    contEspa = 0;
                    stringSet.add(name);
                    name = "";
                }else if(strings[i] != ','){
                    name = name.concat(String.valueOf(strings[i]));
                }
            }

            if(strings[i] == ' ' && contAspasD == 0){
                contAspasD = 2;
            }

            if(cont == 1 && contEspa == 2){
                cont = 0;
                contEspa = 0;
                name = "";
            }

        }

        return stringSet;
    }
}
