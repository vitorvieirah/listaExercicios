import com.sun.source.tree.NewArrayTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex24 {

    public static void main(String[] args) {
        System.out.println(alterString("Vitor"));
    }
    public static String alterString(String s){
        /*char[] strings = s.toCharArray();
        char[] result = new char[strings.length - 2];
        int j = 0;
        for (int i = 1; i < strings.length - 1; i++) {
            result[j] = strings[i];
            j++;
        }*/
        return s.substring(1, s.length() - 1);
    }
}
