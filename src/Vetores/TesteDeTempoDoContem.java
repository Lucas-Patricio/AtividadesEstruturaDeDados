package Vetores;
import ArmazenamentoSequencial.Aluno;
public class TesteDeTempoDoContem {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        long inicio = System.currentTimeMillis();

        for (int i = 1; i < 30000; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
            if(!vetor.contem(aluno)){
                System.out.println("Erro: aluno "
                        + aluno + " não foi adicionado.");
            }
        }

        for (int i = 1; i < 30000; i++) {
            Aluno aluno = new Aluno();
            if(vetor.contem(aluno)){
                System.out.println("Erro: aluno "
                        + aluno + " foi adicionado.");
            }
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo = " + tempo);

    }
}
