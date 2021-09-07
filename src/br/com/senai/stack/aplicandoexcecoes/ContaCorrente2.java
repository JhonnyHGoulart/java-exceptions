package br.com.senai.stack.aplicandoexcecoes;

public class ContaCorrente2 extends Conta2 {

    public ContaCorrente2(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException2 {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
