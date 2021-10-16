package Q_03;

public class objlutador {
    public static void main(String[] args) {
        Lutador ryu =  new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison", 100, 12);

        ryu.aplicarGolpe(bison);
        ryu.aplicarGolpe(bison);
        ryu.aplicarGolpe(bison);
        bison.mostEnergia();

        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        ryu.mostEnergia();
        
    }
}
