package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private List<Integer> notas;

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
            double media = 0;
            int contador = 1;
            double soma = 0;
        for(int e : notas) {
            soma += e;
            media = soma / contador;
            contador++;
        }
        return media;
    }



}
