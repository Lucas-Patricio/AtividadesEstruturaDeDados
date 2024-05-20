package HashTable;
import java.util.List;

public class Teste910 {
    public static void main(String[] args) {
        Exercicio910 conjunto = new Exercicio910();
        conjunto.adiciona("Palavra1");
        conjunto.adiciona("Palavra2");
        conjunto.adiciona("Palavra3");

        List<String> palavras = conjunto.pegaTodas();
        System.out.println("antes de remover");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
        conjunto.remove("Palavra1");
        palavras = conjunto.pegaTodas();
        System.out.println("\ndepois de remover");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

    }
}
