package br.com.senai.stack.aplicandoexcecoes;

public class TesteSacar2 {
    public static void main(String[] args) {
        Conta2 conta = new ContaCorrente2(025,123);
        conta.deposita(200);
        try {
            conta.saca(200);
        }catch(SaldoInsuficienteException2 ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }
    }
}
