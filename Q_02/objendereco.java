package Q_02;

public class objendereco {
    public static void main(String[] args) {


        Endereco endereco = new Endereco("Caixa D'agua", 557, "Final da Cidade", "Caixa D'agua", "Euclides", "BA", "48500-000");


        Medico medico = new Medico(007, "Lucas Gabriel", "Masculino", "Odontologia", endereco);


        medico.mostdMed();
        System.out.println("");


        endereco.setBairro("Centro");
        endereco.setCEP("48700-000");
        endereco.setCidade("Euclides da Cunha");
        endereco.setComplemento("Perto da Praça");
        endereco.setNumero(32);
        endereco.setRua("Roberto Santos");
        endereco.setUF("BA");


        medico.setCodigo(1778);
        medico.setEndereco(endereco);
        medico.setEspecialidade("Dermatologia");
        medico.setNome("Dioclécio Santos");
        medico.setSexo("Masculino");

        medico.mostdMed();

    }
}
