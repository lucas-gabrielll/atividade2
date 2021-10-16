package Q_02;

public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;


    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String uf, String cep){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }


    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getComplemento(){
        return complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }


    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }


    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }


    public String getUF(){
        return uf;
    }

    public void setUF(String uf){
        this.uf = uf;
    }


    public String getCEP(){
        return cep;
    }

    public void setCEP(String cep){
        this.cep = cep;
    }


    public void mostEndereco(){
        System.out.println("***** Endereço *****");
        System.out.println("Rua: " + getRua());
        System.out.println("Número: " + getNumero());
        System.out.println("Complemento: " + getComplemento());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
        System.out.println("UF: " + getUF());
        System.out.println("CEP: " + getCEP());
    }
}
