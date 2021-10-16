package Q_01;

public class Paciente {
    private int codigo;
    private String nome, planoSaude, alergia, dataNascimento, tipoSanguineo, sexo;


    public Paciente(int codigo, String nome, String datNasc, String sexo, String planoSaude, String alergia, String tipoSanguineo){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = datNasc;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }


    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public String getData(){
        return dataNascimento;
    }

    public void setData(String data){
        this.dataNascimento = data;
    }


    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getPlano(){
        return planoSaude;
    }

    public void setPlano(String plano){
        this.planoSaude = plano;
    }

    public String getAlergia(){
        return alergia;
    }

    public void setAlergia(String alergia){
        this.alergia = alergia;
    }


    public String getTipoSang(){
        return tipoSanguineo;
    }

    public void setTipoSang(String sang){
        this.tipoSanguineo = sang;
    }


    public void mostPaciente(){
        System.out.println("DADOS DO PACIENTE: ");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getData());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Plano de Saúde: " + this.getPlano());
        System.out.println("Alergia: " + this.getAlergia());
        System.out.println("Tipo sanguíneo: " + this.getTipoSang());
    }


    public void setPaiMae(int codigo, String nome, String datNasc, String sexo, String planoSaude, String alergia, String tipoSanguineo){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = datNasc;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }


    public void mostResp(){
        System.out.println("DADOS RESPONSÁVEL: ");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getData());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Plano de Saúde: " + this.getPlano());
        System.out.println("Alergia: " + this.getAlergia());
        System.out.println("Tipo sanguíneo: " + this.getTipoSang());
    }

}
