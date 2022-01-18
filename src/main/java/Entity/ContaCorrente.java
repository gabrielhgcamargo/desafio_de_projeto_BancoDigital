package Entity;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimeExtrato() {
        System.out.println("-----------------------------\n-- Extrato Conta Corrente --");
        super.ImprimeInformacoesConta();
        System.out.println("-----------------------------\n");
    }
}
