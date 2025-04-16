package pooJava;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("Gleyson Sampaio");
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(200.0);
        System.out.println(gleyson.limiteCredito);


        Cliente matheus = new Cliente("Matheus Renan");
        System.out.println(matheus.limiteCredito);
        matheus.solicitarLimiteCredito(500.0);
        System.out.println(matheus.limiteCredito);
        matheus.comprar(100.0);

        System.out.println("O limite do(a) " +matheus.nome+ " é " + matheus.limiteCredito);
        System.out.println("O limite do(a)" + gleyson.nome + " é " + gleyson.limiteCredito);
    }
}
