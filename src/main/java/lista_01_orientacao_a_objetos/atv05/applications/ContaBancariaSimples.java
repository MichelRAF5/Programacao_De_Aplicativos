package lista_01_orientacao_a_objetos.atv05.applications;

import lista_01_orientacao_a_objetos.atv05.entities.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaSimples {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ContaBancaria conta= new ContaBancaria();

        System.out.println("Digite o nome do titular: ");
        conta.titular= sc.nextLine();

        String resp;

        do {
            System.out.println(
                "-------------------"+
                "\nSelecione a opção que deseja:"+
                "\n1- Ver saldo"+
                "\n2- Depositar"+
                "\n3- Sacar"+
                "\n-------------------"
            );
            resp= sc.nextLine();

            if (resp.equals("1")) {
                System.out.println(conta.exibirSaldo());

            } else if (resp.equals("2")) {
                System.out.println("Digite o valor que deseja depositar: ");
                double valor= sc.nextDouble();
                sc.nextLine();

                System.out.println("Valor depositado!");
                conta.depositar(valor);

            } else if (resp.equals("3")) {
                System.out.println("Digite o valor que deseja sacar: ");
                double valor= sc.nextDouble();
                sc.nextLine();
                conta.sacar(valor);

                if (conta.saldoSuficiente){
                    System.out.println("Valor depositado!");

                } else
                    System.out.println("Saldo insuficiente");

            } else if (resp.equals("4")) {
                System.out.println("Fechando o programa.");

            } else
                System.out.println("Digite um valor válido!");

        } while (!resp.equals("4"));
    }
}
