package exercicio5;

public class Bateria {
    private int nivelDeBateria;

    public void setNivelDeBateria(int nivelDeBateria) {
        if (nivelDeBateria >= 0 && nivelDeBateria <= 100) this.nivelDeBateria = nivelDeBateria;
        else {
            throw new IllegalArgumentException("Nível de bateria deve estar entre 0 a 100");
        }
    }

    public void exibir(){
        if(nivelDeBateria <= 20) System.out.println("Status: Bateria fraca");
        else if (nivelDeBateria < 80) System.out.println("Status: Bateria ok");
        else{
            System.out.println("Status: Bateria cheia");
        }
    }
}
