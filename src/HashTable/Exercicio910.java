package HashTable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercicio910 {

    private int tamanho = 0;
    private List<List<String>> tabela = new ArrayList<List<String>>();
    public Exercicio910() {
        for (int i = 0; i < 26; i++) {
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    private int calculaIndiceDaTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }

    public boolean contem(String palavra) {
        int indice = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);
        return lista.contains(palavra);
    }

    public void adiciona(String palavra) {
        if (!this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
            this.tamanho++;
        }
    }

    public List<String> pegaTodas() {
        List<String> palavras = new ArrayList<String>();
        for (int i = 0; i < this.tabela.size(); i++) {
            palavras.addAll(this.tabela.get(i));
        }
        return palavras;
    }

    public void remove(String palavra) {
        if (this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
            this.tamanho--;
        }
    }


}
