package Lista_01_Orientacao_a_Objetos.atv08.applications;

import Lista_01_Orientacao_a_Objetos.atv08.entities.Funcionario;

public class CadastroFuncionario {
    static void main(String[] args) {
        Funcionario f= new Funcionario();
        f.nome= "Michel";
        f.sobrenome= "Fonseca";
        f.salarioMensal= 2000.00;

        System.out.printf("O salário do funcionário "+f.nome+" "+f.sobrenome+" com aumento de 10%% é: %.2f%n", f.darAumento(10));
    }
}
