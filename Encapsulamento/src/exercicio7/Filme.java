package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private List<Integer> notas;
    private double media = 0;
    private int contador = 1;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.notas = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            notas.add(nota);
        } else {
            System.out.println("Avaliação inválida. o número deve ser de 1 a 5.");
        }
    }
        public double calcularMedia(){
        for(int e : notas) {
            this.media = (this.media + e)/contador;
            contador++;
        }
        return media;
    }



}
