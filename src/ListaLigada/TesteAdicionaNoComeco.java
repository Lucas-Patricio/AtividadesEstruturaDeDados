package ListaLigada;

public class TesteAdicionaNoComeco {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionaNoComeco("Rafael");
        lista.adicionaNoComeco("Paulo");
        lista.adicionaNoComeco("João");
        System.out.println(lista);
    }

}
