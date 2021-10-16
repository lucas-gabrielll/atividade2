package Q_03;

public class Aviao {
    private int altitude;
    private int velocidade;

    public Aviao(int altitude, int velocidade){
        this.altitude = altitude;
        this.velocidade = velocidade;
    }

    public int getAltitude(){
        return altitude;
    }

    public void setAltitude(int altitude){
        this.altitude = altitude;
    }


    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public void aumAltitude(int aumAlt){
        this.altitude += aumAlt;
    }

    public void dimAltitude(int dimAlt){
        this.altitude -= dimAlt;
    }

    public void aumVelocidade(int aumVel){
        this.velocidade += aumVel;
    }

    public void dimVelocidade(int dimVel){
        this.velocidade -= dimVel;
    }

    public void mostAV(){
        System.out.println("Altitude: " + getAltitude() + " Km");
        System.out.println("Velocidade: " + getVelocidade() + " Km/h \n");
    }

}
