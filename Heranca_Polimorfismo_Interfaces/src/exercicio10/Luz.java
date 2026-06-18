package exercicio10;

public class Luz implements Controlavel {
    private boolean ligado = false;


    @Override
    public void ligar() {
        if(ligado){
            System.out.println("Luz já está ligada.");
        }else {
            System.out.println("Luz ligada.");
            ligado = true;

        }
    }

    @Override
    public void desligar() {
        if(!ligado){
            System.out.println("Luz já está desligada.");
        } else{
            System.out.println("Luz desligada.");
            ligado = false;
        }
    }
}
