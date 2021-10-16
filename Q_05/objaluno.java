package Q_05;

public class objaluno {
    public static void main(String[] args) {
        double m;
        Aluno aluno = new Aluno("Dhomini Andrade", "523.444.118-45");

        aluno.setn1(9);
        aluno.setn2(8);
        aluno.setn3(7.9);

        aluno.calcularMedia();
        m = aluno.getMedia();

        System.out.println("Média do aluno: " + m);

        aluno.setn2(10);
        aluno.calcularMedia();
        m = aluno.getMedia();
        System.out.println("Média do aluno: " + m);
    }
}
