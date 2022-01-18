import Entity.Cliente;
import Entity.ContaCorrente;
import Entity.ContaPoupanca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel", "12487799652", "11 98785-5854");
        Cliente cliente1 = new Cliente("Patricia", "1551151555", "13 1221-5150");

        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca cp = new ContaPoupanca(cliente1);

     cp.depositar(3000.d);
     //cp.depositar(1500.d);

        cp.ImprimeExtrato();
        //cp.ImprimeExtrato();

        cp.sacar(3001.d);

        cp.ImprimeExtrato();
    }
}
