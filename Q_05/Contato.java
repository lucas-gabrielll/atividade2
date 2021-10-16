package Q_05;

public class Contato {
    private String nome;
    private String numero;
    private int nLidas;
    private int enviadas;

    private String mensagens2[] = new String[500];
    

    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }


    public String [] getMensagens2() {
        return mensagens2;
    }

    public void setMensagens2(String [] mensagens2) {
        this.mensagens2 = mensagens2;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }


    public int getNLidas(){
        return nLidas;
    }

    public void setNLidas(int nLidas){
        this.nLidas = nLidas;
    }


    public int getEnviadas(){
        return enviadas;
    }

    public void setEnviadas(int enviadas){
        this.enviadas = enviadas;
    }


    public void enviarMensagem(String mensagem){
        System.out.println("Mensagem enviada para " + getNome() + ". \n");
        this.enviadas += 1;
    }

    public void mensagensNLidas(){
        System.out.println(getNLidas() + " Mensagens não lidas. \n");
    }


    
    public void ReceberMensagens(String mensagem){
        this.mensagens2[this.nLidas] = mensagem;
        this.nLidas += 1;
    }

    public void mostMens(){
        for (int i = 0; i < getNLidas(); i++) {
            System.out.println(this.mensagens2[i]);
            this.mensagens2[i] = null;
        }
        this.setNLidas(0);
    }
    
}
