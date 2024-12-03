public class Ex42 {

    public static void main(String[] args) {
        System.out.println(maskify("7894885757523"));
    }

    public static String maskify(String str) {
        int newStrLength = str.length() - 4;

        char[] charsStr = str.toCharArray();

        String newStr = "";

        for (int i = 0; i < charsStr.length; i++) {
            if(i < newStrLength) {
                newStr = newStr.concat("#");
            } else {
                newStr = newStr.concat(String.valueOf(charsStr[i]));
            }
        }

        return  newStr;
    }
}
