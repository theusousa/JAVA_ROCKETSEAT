package pilares_POO;

public class MSNMessenger {
    public void enviarMensagem(){
        if (validarConectadoInternet())
        System.out.println("Enviar mensagem");
        else
           System.out.println("Computador offline");
    }
    public void receberMensagem(){
        System.out.println("Receber mensagem");
    }
    private boolean validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
        return false;
    }
    private void salvarHistoricomensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}

