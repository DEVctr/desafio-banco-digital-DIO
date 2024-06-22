package org.devctr;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.print("Extrato Conta Corrente");
        super.infosConta();
    }
}
