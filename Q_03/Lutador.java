package Q_03;

public class Lutador {
    private String nome;
    private int energia;
    private int forca;
    static int ff;


    
    public Lutador(String nome, int energia, int forca){
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public int getEnergia(){
        return energia;
    }

    public void mostEnergia(){
        System.out.println("Energia do(a) personagem " + getNome() + ": " + getEnergia());
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getForca(){
        return forca;
    }

    public void setForca(int forca){
        this.forca = forca;
    }
    
    public void reduzirEnergia(){
        this.energia -= ff;
    }

    public void aplicarGolpe(Lutador lut1){
        ff = this.forca;
        lut1.reduzirEnergia();
    }
}
