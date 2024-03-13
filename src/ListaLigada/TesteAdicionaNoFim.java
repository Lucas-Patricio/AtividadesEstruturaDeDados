package ListaLigada;

public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("André");
        System.out.println(lista);
    }
}
