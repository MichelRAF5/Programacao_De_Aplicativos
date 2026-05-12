package lista_01_orientacao_a_objetos.atv08.applications;

import lista_01_orientacao_a_objetos.atv08.entities.Funcionario;

public class CadastroFuncionario {
    public static void main(String[] args) {
        Funcionario f= new Funcionario();
        f.nome= "Michel";
        f.sobrenome= "Fonseca";
        f.salarioMensal= 2000.00;

        System.out.printf("O salário do funcionário "+f.nome+" "+f.sobrenome+" com aumento de 10%% é: %.2f%n", f.darAumento(10));
    }
}
