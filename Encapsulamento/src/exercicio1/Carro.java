package exercicio1;

public class Carro {

    private String modelo, placa;
    private int ano;

    public Carro(String modelo, String placa, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

}
