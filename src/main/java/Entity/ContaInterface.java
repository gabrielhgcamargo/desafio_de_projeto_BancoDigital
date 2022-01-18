package Entity;

public interface ContaInterface {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void ImprimeExtrato();
}
