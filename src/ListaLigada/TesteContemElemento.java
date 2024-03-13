package ListaLigada;

public class TesteContemElemento {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Luan");
        System.out.println(lista.contem("Rafael"));
        System.out.println(lista.contem("Camila"));
        System.out.println(lista.contem("Luan"));
    }
}
