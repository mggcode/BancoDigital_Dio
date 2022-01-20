package BancoJava;

public class Main {
    public static void main(String[] args) {

        Cliente jose = new Cliente();
        jose.setNome("Jose");

        Conta cc = new ContaCorrente(jose);
        Conta poupanca = new ContaPoupanca(jose);


        cc.depositar(1500);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        System.out.println("====================================================\n");

    }



}