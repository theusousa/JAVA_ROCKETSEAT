package pilares_POO;

public class SistemaMensagemInstantanea {
    public void enviarMensagem() {
        if( validarConectadoInternet())
            System.out.println(" Enviar mensagem");
          else
             System.out.println("Computador offline");
        }
        public void receberMensagem() {
            System.out.println("Receber mensagem");
        }
        private boolean validarConectadoInternet() {
            System.out.println("Validando se está conectado a internet");
            return true;
        }
        private void salvarHistorico() {
            System.out.println("Salvando o historico da mensagem");
        }

    }

