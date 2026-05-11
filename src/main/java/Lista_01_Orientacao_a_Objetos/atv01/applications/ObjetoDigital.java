package Lista_01_Orientacao_a_Objetos.atv01.applications;

import Lista_01_Orientacao_a_Objetos.atv01.entities.Lampada;

import java.util.Scanner;

public class ObjetoDigital {
    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Lampada lampada = new Lampada();

            System.out.println("Deseja ligar a lampada? (s/n)");
            char resp= sc.next().charAt(0);

            if (resp=='s') {
                lampada.ligar();
            }
            else if (resp=='n') {
                lampada.desligar();
            }
            else {
                System.out.println("Digite uma resposta válida.");
            }

            System.out.println(lampada.exibirStatus());
            sc.close();
    }
}
