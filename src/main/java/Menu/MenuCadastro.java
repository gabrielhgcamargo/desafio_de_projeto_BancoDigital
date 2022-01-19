package Menu;

import Entity.Cliente;
import Entity.ContaCorrente;
import Entity.ContaPoupanca;

import java.util.Scanner;

// Classe responsável pelos menus e cadastro de clientes, utilizado Sobrecarga
public class MenuCadastro {

    // Cliente2 e sua Conta instanciados para possibilitar operações de transferência
    private final Cliente cliente2 = new Cliente("Fulano","11122233344","15 998487885","fulano@gmail.com");
    private final ContaCorrente cc2 = new ContaCorrente(cliente2);


    Scanner teclado = new Scanner(System.in);

    public Cliente cadastroCliente(){

        System.out.print("\nInforme os dados para efetuar o cadastro...\nNome: ");
        String nome = teclado.next();
        System.out.print("CPF: ");
        String cpf = teclado.next();
        System.out.print("Telefone: ");
        String telefone = teclado.next();
        System.out.print("E-mail: ");
        String email = teclado.next();

        Cliente cliente1 = new Cliente(nome, cpf, telefone, email);
        return cliente1;
    }

    public void menu(ContaCorrente contaCorrente){
        System.out.print("\n--- MENU BANCO INTEL ---\n\n");
        int op;


        do {
            System.out.print("1 - Depósito\n2 - Saque\n3 - Transferencia\n4 - Realizar Projeção de Rendimento\n" +
                    "5 - Para imprimir o Extrato e Dados cadastrados\n6 - Para sair\nE para retornar ao início do menu, digitar qualquer outro número\n" +
                    "\nDigite o número da ação desejada: ");
            op = teclado.nextInt();
            System.out.println(" ");
            if (op == 1) {
                System.out.print("\nQuantia que deseja depositar : ");
                contaCorrente.depositar(teclado.nextDouble());
            }
            else if(op == 2){
                System.out.print("\nQuantia que deseja sacar : ");
                contaCorrente.sacar(teclado.nextDouble());
            }
            else if (op == 3){
                System.out.print("Quantia que deseja transferir para a ContaCorrente de cliente2: ");
                contaCorrente.transferir(teclado.nextDouble(), cc2);
            }
            else if(op == 4){
                int meses;
                double valor;
                System.out.print("\nQuantia e tempo para simular o rendimento\nValor a ser Investido: ");
                valor = teclado.nextDouble();
                System.out.print("Tempo em meses que pretende deixar o valor inserido: ");
                meses = teclado.nextInt();

                double valorRentavel = meses * (0.0005 * valor);

                System.out.println(String.format("\nApós %d meses, o valor de R$ %.2f renderá %.2f em sua Conta Corrente.\n", meses,valor,valorRentavel));
            }
            else if(op == 5){
                contaCorrente.ImprimeExtrato();
            }
            else if (op == 6){
                System.out.println("\nObrigado pela preferência!");
                break;
            }
        } while (true);
    }

    public void menu(ContaPoupanca contaPoupanca){
        System.out.print("\n--- MENU BANCO INTEL ---\n\n");
        int op;


        do {
            System.out.print("1 - Depósito\n2 - Saque\n3 - Transferencia\n4 - Realizar Projeção de Rendimento\n" +
                    "5 - Para imprimir o Extrato e Dados cadastrados\n6 - Para sair\nE para retornar ao início do menu, digitar qualquer outro número\n" +
                    "\nDigite o número da ação desejada: ");
            op = teclado.nextInt();
            System.out.println(" ");
            if (op == 1) {
                System.out.print("\nQuantia que deseja depositar : ");
                contaPoupanca.depositar(teclado.nextDouble());
            }
            else if(op == 2){
                System.out.print("\nQuantia que deseja sacar : ");
                contaPoupanca.sacar(teclado.nextDouble());
            }
            else if (op == 3){
                System.out.print("Quantia que deseja transferir para a ContaCorrente de cliente2: ");
                contaPoupanca.transferir(teclado.nextDouble(), cc2);
            }
            else if(op == 4){
                int meses;
                double valor;
                System.out.print("\nQuantia e tempo para simular o rendimento\nValor a ser Investido: ");
                valor = teclado.nextDouble();
                System.out.print("Tempo em meses que pretende deixar o valor inserido: ");
                meses = teclado.nextInt();

                double valorRentavel = meses * (0.0035 * valor);

                System.out.println(String.format("\nApós %d meses, o valor de R$ %.2f renderá %.2f em sua Conta Poupança.\n", meses,valor,valorRentavel));
            }
            else if(op == 5){
                contaPoupanca.ImprimeExtrato();
            }
            else if (op == 6){
                System.out.println("\nObrigado pela preferência!");
                break;
            }
        } while (true);

    }



}