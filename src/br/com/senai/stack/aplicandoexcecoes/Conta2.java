package br.com.senai.stack.aplicandoexcecoes;

public abstract class Conta2 {
    protected double saldo;
    private int agencia;
    private int numero;
    private static int total = 0;

    public Conta2(int agencia, int numero) {
        Conta2.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException2 {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException2("Saldo Insuficiente! " + this.saldo + " Saque Pendente: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta2 destino) throws SaldoInsuficienteException2 {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public static int getTotal() {
        return Conta2.total;
    }
}