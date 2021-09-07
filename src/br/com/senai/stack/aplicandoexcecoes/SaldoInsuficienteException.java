package br.com.senai.stack.aplicandoexcecoes;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
