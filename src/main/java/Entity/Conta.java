package Entity;

import lombok.*;


@Getter
public abstract class Conta implements ContaInterface{

    private static final int numeroFixoAgencia = 1;
    private static int contadorNumeroConta = 1;

    protected int numero;
    protected int agencia;
    protected Cliente cliente;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.numero = contadorNumeroConta++;
        this.agencia = numeroFixoAgencia;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = this.saldo;
        if ((saldoAtual-= valor) < 0){
            System.out.println(String.format("\nFALHA NO SAQUE!\nNão foi possível sacar R$ %.2f\nPois seu saldo atual é de R$ %.2f\n", valor, this.saldo));
        }
        else {
            this.saldo -= valor;
            System.out.println("\nSaque realizado com sucesso, saldo atual é de R$ " + this.saldo+ "\n");
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("\nDepósito realizado com sucesso! Saldo atual é de R$" + this.saldo + "\n");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        double saldoAtual = this.saldo;
        if((saldoAtual-= valor) < 0){
            System.out.println(String.format("\nFALHA NA TRANSFERÊNCIA!\nNão foi possível realizar a transferência de R$ %.2f pois seu saldo atual é de R$ %.2f\n", valor, this.saldo));
        }
        else{
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println(String.format("\nTransferência de R$ %.2f realizada com sucesso! Saldo atual é de R$ %.2f\n", valor, this.saldo));
        }
    }


    protected void ImprimeInformacoesConta() {
        System.out.println("Agencia = " +  this.agencia);
        System.out.println("Numero = " + this.numero);
        System.out.println("Saldo = R$ " + this.saldo);
        System.out.println("\n ---Informações do Titular---");
        System.out.println("Nome = " + this.cliente.getNome());
        System.out.println("CPF = " + this.cliente.getCpf());
        System.out.println("Telefone = " + this.cliente.getTelefone() + "\n");

    }
}
