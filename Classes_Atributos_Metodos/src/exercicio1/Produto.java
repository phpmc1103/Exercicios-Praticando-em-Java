package exercicio1;

public class Produto {
    String name;
    double price;
    int quantity;

    public void displayInfo(){
        System.out.printf("""
                Produto: %s
                Preço: %.2f
                Quantidade em estoque: %d""",name,price,quantity);
    }
}
