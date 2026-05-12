package lista_01_orientacao_a_objetos.atv07.applications;

import lista_01_orientacao_a_objetos.atv07.entities.Carro;

import java.util.Scanner;

public class CarroMundoReal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Carro carro= new Carro();

        System.out.println("Digite a marca do carro: ");
        carro.marca= sc.nextLine();
        System.out.println("Digite o modelo do carro: ");
        carro.modelo= sc.nextLine();

        char resp;

        do {
            System.out.println(
                    "-----------------------------------------------" +
                            "\nO carro "+carro.modelo+" da marca "+carro.marca+" está a " + carro.velocidadeAtual + " Km/h" +
                            "\n1- Acelerar" +
                            "\n2- Frear" +
                            "\n3- Sair"+
                            "\n-----------------------------------------------"
            );
            resp= sc.next().charAt(0);

            if (resp=='1') {
                carro.acelerar();
            }
            else if (resp=='2') {
                carro.frear();
            }
            else if (resp=='3') {
                System.out.println("Saindo...");
            }
            else
                System.out.println("Digite uma resposta válida");

        } while (resp!='3');
    }
}
