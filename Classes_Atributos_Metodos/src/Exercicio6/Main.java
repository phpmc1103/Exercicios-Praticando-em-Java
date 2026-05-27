package Exercicio6;
//Você está desenvolvendo um sistema de controle de colaboradores para uma empresa de tecnologia.
// Às vezes, é necessário atualizar o cargo e o nível de acesso de um funcionário devido a promoções ou
// mudanças de departamento. Seu programa deve permitir essas alterações e mostrar as informações atualizadas.
//
//Crie uma classe que:
//
//Represente um colaborador com os atributos nome, cargo e nivel de acesso.
//Implemente um metodo que permita alterar o cargo e o nível de acesso.
//Exiba no console as informações antes e depois da atualização.
//Exemplo de entrada:
//
//Nome: Júlia Oliveira
//Cargo atual: Pessoa Desenvolvedora Júnior
//Novo cargo: Pessoa Desenvolvedora Plena
//Nível de acesso atual: 1
//Novo nível de acesso: 2
//Copiar código
//Saída esperada:
//
//--- Antes da atualização ---
//Nome: Júlia Oliveira
//Cargo: Pessoa Desenvolvedora Júnior
//Nível de acesso: 1
//
//--- Após atualização ---
//Nome: Júlia Oliveira
//Cargo: Pessoa Desenvolvedora Plena
//Nível de acesso: 2

public class Main {
    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador();
        colaborador1.nome ="Júlia Oliveira";
        colaborador1.cargo = "Pessoa Desenvolvedora Júnior";
        colaborador1.nivelDeAcesso = 1;
        System.out.println("\n--- Antes da atualização ---");
        System.out.println("Nome: " +colaborador1.nome);
        System.out.println("Cargo: "+colaborador1.cargo);
        System.out.println("Nível de acesso: "+colaborador1.nivelDeAcesso);

        colaborador1.mudar("Pessoa Desenvolvedora Plena",2);
        System.out.println("\n--- Após a atualização ---");
        System.out.println("Nome: " +colaborador1.nome);
        System.out.println("Cargo: "+colaborador1.cargo);
        System.out.println("Nível de acesso: "+colaborador1.nivelDeAcesso);

    }
}
