package org.devctr;

public class ContaPoupança extends Conta {
    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.print("Extrato Conta Poupança");
        super.infosConta();
    }
}
