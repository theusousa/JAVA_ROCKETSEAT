package controle_de_fluxo_repeticao;

import java.util.Random;

public class ExemploFor {
    public static void main(String[] args) {
        boolean dormiu = false;
        for (int carneirinho = 1 ; carneirinho <=20; carneirinho++){
            System.out.println(carneirinho + "- Carneirinhos(s)");
            if (dormiu = new Random().nextInt(20)== carneirinho)
                System.out.println("Dormiu...");
            break;
        }
    }
}
