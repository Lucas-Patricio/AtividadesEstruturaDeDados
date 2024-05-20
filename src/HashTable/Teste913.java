package HashTable;

public class Teste913 {
    public static void main(String[] args) {
        Exercicio913 conjunto = new Exercicio913();
        for (int i = 0; i < 100; i++) {
            conjunto.adiciona("" + i);
        }
        conjunto.imprimeTabela();
    }
}