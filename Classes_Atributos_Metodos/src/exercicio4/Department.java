package Exercicio4;

public class Department {
    String location;
    double temperature;

    public void showReport(){
        System.out.printf("Sensor no local: %s%n",location);
        System.out.printf("Temperatura: %.1f%n",temperature);
        if(temperature > 37.5) System.out.println("Alerta: Temperatura acima do limite!");
    }

}
