package lista_01_orientacao_a_objetos.atv06.applications;

import lista_01_orientacao_a_objetos.atv06.entities.Aluno;

import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Aluno aluno= new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome= sc.nextLine();
        System.out.println("Digite a matricula do aluno: ");
        aluno.matricula= sc.nextInt();

        for (int i= 0; i < aluno.notas.length; i++) {
            System.out.println("Digite a "+(i+1)+" nota.");
            aluno.notas[i]= sc.nextDouble();
        }

        System.out.println(aluno.verificarSituacao());
    }
}
