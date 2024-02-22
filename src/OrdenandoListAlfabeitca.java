import java.util.*;
import java.util.stream.Stream;

public class OrdenandoListAlfabeitca {
    public static void main(String[] args) {
       /*List<String> strings = new ArrayList<>();
        strings.add("b");
        strings.add("e");
        strings.add("z");
        strings.add("a");
        strings.add("b");
        strings.add("a");

        Set<String> stringSet = new HashSet<String>(strings);

        System.out.println(stringSet);*/

        List<Integer> lista = Arrays.asList(3, 8, 1, 6, 2, 9, 5); // Exemplo de lista de inteiros

        // Chamada do método Collections.max() para encontrar o maior elemento
        /*int maiorElemento = Collections.max(lista);

        System.out.println("O maior elemento da lista é: " + maiorElemento);*/

        Set<Integer> teste = new HashSet<>();
        teste.add(1);
        teste.add(15);
        teste.add(2);

        teste.forEach(System.out::println);
    }
}
