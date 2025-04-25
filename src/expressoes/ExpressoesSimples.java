package expressoes;

import java.net.Inet4Address;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "matheus renan";
        Integer maticula = 123;
        Double salario = 3500.98;
        String dodosFuncionario = String.format("Mat.: %d - Nome: %s - Sal.: %,.2f" , maticula , nome, salario);
        System.out.println(dodosFuncionario);
    }

}
