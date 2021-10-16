package Q_01;
import java.util.Scanner;

public class objpaciente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo;
        String nome, planS, alergia, dataNasc, tipoSang, sexo, r;

        System.out.println("PACIENTE: ");
        System.out.println("Código: ");
        codigo = scan.nextInt();
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Data de Nascimento: ");
        dataNasc = scan.next();
        System.out.println("Sexo [F/M]: ");
        sexo = scan.next().toUpperCase();
        System.out.println("Plano de Saúde: ");
        planS = scan.next();
        System.out.println("Possui alergias? [S/N] ");
        r = scan.next().toUpperCase();

        if (r.equals("S")){
            System.out.println("Qual é a alergia do paciente? ");
            alergia = scan.next();
        }else{
            alergia = "Não possui";
        }
        System.out.println("Tipo Sanguíneo: ");
        tipoSang = scan.next();

        Paciente paciente = new Paciente(codigo, nome, dataNasc, sexo, planS, alergia, tipoSang);
        System.out.println("");
        paciente.mostPaciente();
        System.out.println("");

        System.out.println("RESPONSÁVEL:");
        System.out.println("Código: ");
        codigo = scan.nextInt();
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Data de Nascimento: ");
        dataNasc = scan.next();
        System.out.println("Sexo: ");
        sexo = scan.next().toUpperCase();
        System.out.println("Plano de Saúde: ");
        planS = scan.next();
        System.out.println("Possui alergias? [S/N] ");
        r = scan.next().toUpperCase();

        if (r.equals("S")){
            System.out.println("Qual é a alergia do responsável? ");
            alergia = scan.next();
        }else{
            alergia = "Não possui";
        }

        System.out.println("Tipo Sanguíneo: ");
        tipoSang = scan.next();

        Paciente resp = new Paciente(codigo, nome, dataNasc, sexo, planS, alergia, tipoSang);
        System.out.println("");

        resp.mostResp();

        scan.close();

    }
}
