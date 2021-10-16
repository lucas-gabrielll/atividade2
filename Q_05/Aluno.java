package Q_05;

public class Aluno {
    private String nome;
    private String cpf;
    private double n1, n2, n3, m;


    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }


    public double getn1(){
        return n1;
    }

    public void setn1(double n1){
        this.n1 = n1;
    }


    public double getn2(){
        return n2;
    }

    public void setn2(double n2){
        this.n2 = n2;
    }


    public double getn3(){
        return n3;
    }

    public void setn3(double n3){
        this.n3 = n3;
    }

    public double getMedia(){
        return m;
    }

    public void calcularMedia(){
        m = (n1 + n2 + n3) / 3;
    } 

}
