package Menu;

import Entity.ContaCorrente;
import Entity.ContaPoupanca;

import java.util.Scanner;

public class MainComMenu {
    public static void main(String[] args) {

        /*
        Podemos criar um Menu, onde o usuário se cadastra e realiza as ações desejadas.
         */
        MenuCadastro menu = new MenuCadastro();
        int cont = 1, op;
        Scanner teclado = new Scanner(System.in);
        System.out.print("------   BEM VINDO AO BANCO INTEL   ------\n\nQue tipo de conta deseja utilizar :\n1 - Conta Corrente\n2 - Conta Poupança\n Opção escolhida: ");
        op = teclado.nextInt();
        if (op == 1) {
            ContaCorrente cc = new ContaCorrente(menu.cadastroCliente());
            menu.menu(cc);
        } else if (op == 2) {
            ContaPoupanca cp = new ContaPoupanca(menu.cadastroCliente());
            menu.menu(cp);
        }
    }
}