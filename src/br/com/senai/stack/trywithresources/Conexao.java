package br.com.senai.stack.trywithresources;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexão");
    }

    public void lerDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("fechando conexão");
    }
}
