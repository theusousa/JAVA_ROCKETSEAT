package controle_de_fluxo_repeticao;

import java.util.Random;

public class ExemploDoWhile {
    private static int numerotentativas = 0;
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executar repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        }while (tocando());
        if (numerotentativas<=5)
            System.out.println("AlÔ !!!");
        else
            System.out.println("Não atendeu");

    }

    private static boolean tocando(){
        numerotentativas++;
        boolean atendeu = new Random().nextInt(5)==1;
        if (numerotentativas == 5)
              return false;
        else
            return !atendeu;
    }
}
