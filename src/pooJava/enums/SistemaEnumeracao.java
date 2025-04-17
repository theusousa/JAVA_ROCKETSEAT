package pooJava.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        String nomeString = "sao_paulo";
        EstadoBrasileiro eb = EstadoBrasileiro.valueOf(nomeString.toUpperCase());
        System.out.println(eb.getNome());
        System.out.println(eb.name());
        System.out.println(eb.getSigla());
    }


}
