package Ex22;

public class Ex22 {
    //∆ 1.12.9. Foi feita uma pesquisa para determinar o índice de mortalidade infantil em um certo
    //período. Fazer um algoritmo que:
    //- leia inicialmente o número de crianças nascidas no período;
    //- leia, em seguida um número indeterminado de linhas, contendo, cada uma, o sexo de
    //uma criança morta (masculino, feminino) e o número de meses de vida da criança. A
    //última linha, que não entrará nos cálculos, contém no lugar do sexo a palavra “vazio”;
    //- determine e imprima:
    //a) a porcentagem de crianças mortas no período;
    //b) a porcentagem de crianças do sexo masculino mortas no período;
    //c) a porcentagem de crianças que viveram 24 meses ou menos no período.



    public static void main(String[] args) {
        while (true) {
            switch (Menus.menuInical()) {
                case 1:
                    Menus.menuCadastro();
                    break;
                case 2:
                    Menus.menuGetPesquisa();
                    break;
                case 3:
                    Menus.menuDeletar();
            }
        }
    }
}
