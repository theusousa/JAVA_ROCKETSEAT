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
            System.out.println("AlÔ !!!");

    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu" + atendeu);
        //negando o ato de continuar tocando
        return !atendeu;

    }
}
