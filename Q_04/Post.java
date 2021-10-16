package Q_04;

public class Post {
    
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompa;

    public Post(String texto, String link){
        this.texto = texto;
        this.link = link;
    }


    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }


    public String getLink(){
        return link;
    }

    public void setLink(String link){
        this.link = link;
    }


    public int getNumeroCurtidas(){
        return numeroCurtidas;
    }

    public void setNumeroCurtidas(int numeroCurtidas){
        this.numeroCurtidas = numeroCurtidas;
    }


    public int getNumeroCompa(){
        return numeroCompa;
    }

    public void setNumeroCompa(int numeroCompa){
        this.numeroCompa = numeroCompa;
    }

    public void curtir(){
        this.numeroCurtidas += 1;
    }

    public void compartilhar(){
        this.numeroCompa += 1;
    }

}
