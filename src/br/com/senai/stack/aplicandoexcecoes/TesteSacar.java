package br.com.senai.stack.aplicandoexcecoes;

public class TesteSacar {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,025);
        conta.deposita(200);
        conta.saca(200);
        System.out.println(conta.getSaldo());
    }
}
