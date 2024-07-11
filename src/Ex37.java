//We need a function that can transform a number (integer) into a string.

public class Ex37 {

    public static void main(String[] args) {
        System.out.println(numberToString(123));
    }

    public static String numberToString(int num){
        return String.valueOf(num);
    }
}
