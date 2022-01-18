package Entity;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimeExtrato() {
        System.out.println("-----------------------------\n-- Extrato Conta Poupanca --");
        super.ImprimeInformacoesConta();
        System.out.println("-----------------------------\n");
    }
}
