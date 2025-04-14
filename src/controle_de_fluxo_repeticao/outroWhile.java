package controle_de_fluxo_repeticao;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class outroWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada);
            valorDoce  = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionar no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("mesada:"+ mesada);
        System.out.println("Anya gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
