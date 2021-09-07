package br.com.senai.stack.trywithresources;

public class ConexaoTest {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.lerDados();
        } catch (RuntimeException ex) {
            System.out.println("Erro!");
        }

//        Conexao conexao = null;
//        try{
//            conexao = new Conexao();
//            conexao.lerDados();
//        }catch(IllegalStateException ex){
//            System.out.println("Erro!");
//        }finally {
//            System.out.println("finally");
//            if(conexao != null){
//                conexao.close();
//            }
//        }
    }
}
