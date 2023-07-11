package Ex22;

import java.util.ArrayList;
import java.util.List;

public abstract class CriancaRepository {
    static List<Crianca> criancas = new ArrayList<>();

    public static void addCriancas(Crianca crianca){
        criancas.add(crianca);
    }
}
