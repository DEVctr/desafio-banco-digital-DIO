package org.devctr;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Victor", "0123456789", "victor@email.com", "12345678");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupança(cliente);

        cc.depositar(100);
        poupanca.depositar(100);
        cc.transferir(50, poupanca);

        cc.extrato();
        poupanca.extrato();
    }
}