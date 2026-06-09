package exercicio10;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Double> lista;

    public Disciplina(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(double nota) {
        if(nota >= 0 && nota <= 10){
            lista.add(nota);
        }else{
            System.out.println("Nota inválida ignorada: "+nota);
        }
    }

    public int contarNotasValidas(){
        return lista.size();
    }


    public double media() {
        double somaDeNotas = 0;
        if(lista.isEmpty()) return 0;

        for (double nota : lista){
            somaDeNotas += nota;
        }
        return somaDeNotas / lista.size();
    }
}