package BancoJava;

public class ContaCorrente extends  Conta {

    public  ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====================================================\n");
        System.out.println("***** Extrato Conta Corrente *****\n");
        super.imprimirInfosComuns();
    }
}
