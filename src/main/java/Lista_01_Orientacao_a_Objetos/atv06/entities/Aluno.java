package Lista_01_Orientacao_a_Objetos.atv06.entities;

public class Aluno {
    public String nome;
    public int matricula;
    public double notas[] = new double[3];

    public double calcularMedia() {
        double soma=0;
        for (int i = 0; i < notas.length; i++) {
            soma+= notas[i];
        }

        return soma/(notas.length);
    }

    public String verificarSituacao() {
        if (calcularMedia() >= 7) {
            return "Aprovado";
        }
        else
            return "Reprovado";
    }
}
