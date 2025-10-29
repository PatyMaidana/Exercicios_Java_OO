public class aluno {
    private String nomeAluno;
    private double nota01;
    private double nota02;
    private double nota03;
    private double nota04;
    private double mediaAnual;

    public aluno(String nomeAluno, double nota01, double nota02, double nota03, double nota04){
        this.nomeAluno = nomeAluno;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getNota03() {
        return nota03;
    }

    public void setNota03(double nota03) {
        this.nota03 = nota03;
    }

    public double getNota04() {
        return nota04;
    }

    public void setNota04(double nota04) {
        this.nota04 = nota04;
    }

    public double calculaMedia () {
        return (nota01 + nota02 + nota03 + nota04) / 4;
     }
}
