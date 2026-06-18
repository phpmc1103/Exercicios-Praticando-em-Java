package exercicio10;

public class ArCondicionado implements Controlavel{
    private boolean ligado = false;

    @Override
    public void ligar() {
        if(ligado){
            System.out.println("Ar condicionado já está ligado.");
        }else {
            System.out.println("Ar condicionado ligado.");
            ligado = true;
        }
    }

    @Override
    public void desligar() {
        if(!ligado){
            System.out.println("Ar condicionado já está desligado.");
        } else{
            System.out.println("Ar condicionado desligado.");
            ligado = false;
        }
    }
}
