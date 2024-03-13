package ListaLigada;

public class TestePegaPorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Pablo");
        System.out.println(lista.pega(0));
        System.out.println(lista.pega(1));
        System.out.println(lista.pega(2));
    }
}
