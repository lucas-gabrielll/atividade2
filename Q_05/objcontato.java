package Q_05;

public class objcontato {
    public static void main(String[] args) {
        Contato contato = new Contato("Tio", "75 99430 - 9227");    

        contato.enviarMensagem("Fala ae");
        contato.mensagensNLidas();
        contato.ReceberMensagens("Fala tu");
        contato.ReceberMensagens("Tudo de boa?");
        contato.ReceberMensagens("Como estão as namoradinhas?");
        contato.ReceberMensagens("Que dia aparece?");
        contato.ReceberMensagens("Saudades! \n");
        contato.mensagensNLidas();
        contato.mostMens();
        contato.mensagensNLidas();
        
    }
}
