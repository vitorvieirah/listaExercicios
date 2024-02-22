import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Ex30 {

    static List<Integer> divisores = new ArrayList<>();
    static List<Integer> divisores2 = new ArrayList<>();
    static List<Integer> maioresElementos = new ArrayList<>();


    public static void main(String[] args) {

        System.out.println(maoirDivisorComun(15, 17));
    }

    private static int maoirDivisorComun(int num1, int num2){

        for (int i = 2; i <= num1 || i <= num2; i++) {
            if(num1 % i == 0 && num2 % i == 0){
                num1 = num1 / i;
                num2 = num2 / i;
                divisores.add(i);
                i = 1;
            }else if(num1 % i == 0){
                num1 = num1 / i;
                i = 1;
            }else if (num2 % i == 0){
                num2 = num2 / i;
                i = 1;
            }
        }

        int result = 0;

        if(divisores.size() > 0)
            result += divisores.get(0) * divisores.get(1);
        else
            result = 1;

        return result;
    }
}
