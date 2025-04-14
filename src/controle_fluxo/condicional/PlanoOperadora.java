package controle_fluxo.condicional;

public class PlanoOperadora {
    public static void main(String[] args) {
        String Plano= "Turbo";

        switch (Plano){

            case "Turbo": {
                System.out.println("100 minutos de ligção");
                System.out.println("WhatsApp e Instagram grátis");
                System.out.println("5 GB YouTube.");
                break;
            }
            case "MIDIA":{
                System.out.println("100 minutos de ligação");
                System.out.println("WhatsApp e Instagram Grátis");
                break;
            }
            case "BASIC":{
                System.out.println("100 minutos de ligação");
                break;
            }

        }

    }
}
