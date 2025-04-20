package pilares_POO;

public class ComputadorMatheus {
    public static void main(String[] args) {
        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();


        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();


        FacebookMessenger facebookMessenger = new FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();
    }
}
