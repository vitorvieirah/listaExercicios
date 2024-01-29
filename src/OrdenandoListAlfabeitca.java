import java.util.*;

public class OrdenandoListAlfabeitca {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("b");
        strings.add("e");
        strings.add("z");
        strings.add("a");
        strings.add("b");
        strings.add("a");

        Set<String> stringSet = new HashSet<String>(strings);

        System.out.println(stringSet);
    }
}
