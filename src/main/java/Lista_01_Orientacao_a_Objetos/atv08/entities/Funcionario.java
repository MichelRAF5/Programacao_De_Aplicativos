package Lista_01_Orientacao_a_Objetos.atv08.entities;

public class Funcionario {
    public String nome, sobrenome;
    public double salarioMensal;

    public double darAumento(double porcentagem) {
        double aumento= (porcentagem/100)*salarioMensal;
        return salarioMensal+aumento;
    }
}