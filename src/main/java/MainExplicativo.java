import Entity.Cliente;
import Entity.ContaCorrente;
import Entity.ContaPoupanca;

public class MainExplicativo {
    public static void main(String[] args) {

        // Instanciação de um Cliente
        Cliente cliente1 = new Cliente("Gabriel","18978585458","15 97874-1542","gabrielgarcia@outlook.com");

        // Instanciação de outro Cliente
        Cliente cliente2 = new Cliente("Everaldo","46985632592","11 98785-2689","everaldoafonso@gmail.com");

        // Definindo os tipos de conta para os clientes
        // Para o cliente 1, Conta Corrente
        ContaCorrente cc = new ContaCorrente(cliente1);
        //Para o cliente 2, Conta Poupança
        ContaPoupanca cp = new ContaPoupanca(cliente2);

        // Para exibir extrato + informações da Conta/Cliente utilizar o método ImprimeExtrato();
        cc.ImprimeExtrato();
        cp.ImprimeExtrato();

        // Para deposito, utilizar o método depositar() e passar como parãmetro o valor a ser depositado.
        cc.depositar(1500);
        cp.depositar(1000);

        // Para saque, utilizar o método sacar() e passar como parâmetro o valor a ser sacado.
        cc.sacar(1000);
        cp.sacar(1500);

        // Para transferência, utilizar o método transferir(), e passar como parâmetros o valor e a conta a ser depositado o dinheiro.
        cc.transferir(1000, cp);
        cp.transferir(1000,cc);


    }

}
